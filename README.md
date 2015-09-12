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

If you fail bitbake with userland.bb, 
Could you try to use vc-graphics-hardfp instead of userland as follows:

In local.conf
```
PREFERRED_PROVIDER_virtual/egl = "vc-graphics-hardfp"
PREFERRED_PROVIDER_virtual/libgles2 = "vc-graphics-hardfp"
```

Main layer maintainers:
  Yusuke Mitsuki <mickey.happygolucky@gmail.com>
