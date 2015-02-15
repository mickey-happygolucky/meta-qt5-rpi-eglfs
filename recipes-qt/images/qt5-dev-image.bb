DESCRIPTION = "An image that development environment for the embedded (not based on X11) version of Qt5."
LICENSE = "MIT"
PR = "r0"

LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

IMAGE_INSTALL += "\
    ${CORE_IMAGE_BASE_INSTALL} \
    packagegroup-qt5 \
"

IMAGE_FEATURES_append = " ssh-server-openssh tools-debug splash"

inherit core-image
