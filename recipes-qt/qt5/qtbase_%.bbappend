FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://qt5base-rpi-platform.patch"

PACKAGECONFIG_append =  " dbus evdev widgets tools libs linuxfb gles2 \
                        examples teststools accessibility openvg \
			sql-sqlite gstreamer gst-plugins-base"
