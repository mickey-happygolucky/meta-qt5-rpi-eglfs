PACKAGECONFIG += " qt opengl-es"
PACKAGECONFIG[qt] = "-DWITH_QT=ON,-DWITH_QT=OFF,qtbase,"
PACKAGECONFIG[opengl-es] = "-DWITH_OPENGLES=ON,-DWITH_OPENGLES=OFF,virtual/libgles2,"

# Ugly hack to work around undefined OE_QMAKE_PATH_EXTERNAL_HOST_BINS variable
# and possibly missing qmake binary (qtbase-native can be removed from sysroot
# e.g. in order to upgrade it, even when there is target qtbase)

# Fixes errors like this in cmake(-native).do_configure:
#| -- Performing Test run_pic_test - Success
#| CMake Error at tmp-eglibc/sysroots/qemuarm/usr/lib/cmake/Qt5Core/Qt5CoreConfig.cmake:27 (message):
#|   The imported target "Qt5::Core" references the file
#|
#|      "/qmake"
#|
#|   but this file does not exist.  Possible reasons include:

do_configure_prepend() {
    export OE_QMAKE_PATH_HOST_BINS=${STAGING_DIR_NATIVE}/usr/bin/qt5
    sed -i 's/^if(WITH_QT)/if (WITH_QT)\n    set( OE_QMAKE_PATH_EXTERNAL_HOST_BINS $ENV{OE_QMAKE_PATH_HOST_BINS} )/g' ${S}/cmake/OpenCVFindLibsGUI.cmake
}
