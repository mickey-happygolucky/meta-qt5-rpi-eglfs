SUMMARY = "Qt5 for Embedded Linux (Qt without X11)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

PR = "r0"

inherit packagegroup

RDEPENDS_${PN} = " \
       gstreamer1.0 \
       gstreamer1.0-libav \
       gstreamer1.0-plugins-base \
       gstreamer1.0-plugins-good \
       gstreamer1.0-plugins-bad \
       gstreamer1.0-plugins-ugly \
       gstreamer1.0-plugins-base-meta \
       gstreamer1.0-plugins-good-meta \
       gstreamer1.0-plugins-bad-meta \
       gstreamer1.0-plugins-ugly-meta \
       kernel-modules \
       dbus \
       qtsvg \
       qtsvg-plugins \
       qtbase \
       qtbase-fonts \
       qtbase-tools \
       qtbase-plugins \
       quitbattery \
       quitindicators \
       qtsmarthome \
       cinematicexperience \
       qt5ledscreen \
       qt5nmapcarousedemo \
       qt5nmapper \
       openssh-sftp-server \
       qt3d \
       qtimageformats \
       qtimageformats-plugins \
       qtmultimedia \
       qtmultimedia-plugins \
       qtmultimedia-qmlplugins \
"
