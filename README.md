meta-qt5-rpi-eglfs support to work qt5 with eglfs on RPi/RPi2.
This layer is unofficial.

This layer depends on:

URI: git://github.com/meta-qt5/meta-qt5.git
branch: master
revision: HEAD

URI: git://github.com/openembedded/meta-oe.git
branch: master
revision: HEAD

If you want to use opencv depends on meta-oe.
Otherwise you can mask a opencv in this layer as follows:

In local.conf
```
BBMASK = "meta-qt5-rpi-eglfs/recipes-support/opencv"
```

Main layer maintainers:
  Yusuke Mitsuki <mickey.happygolucky@gmail.com>