# meta-edison-ii - add some ii to the standard Intel Edison distro

meta-edison-ii is a layer that can be used with the standard Intel Edison distro to provision instant infrastructure!

### Installation

Using "..." to represent the install directory of the Edison source:

    cd .../edison-src/device-software
    git clone git://github.com/richards-tech/meta-edison-rt
    
The layer needs to added to the bblayers.conf file which is at:

    .../edison-src/build/conf/bblayers.conf
    
Add a line to the layers so that the BBLAYERS variable looks like this:

    BBLAYERS ?= " \
        /home/syntro/work/edison/edison-src/poky/meta \
        /home/syntro/work/edison/edison-src/poky/meta-yocto \
        /home/syntro/work/edison/edison-src/poky/meta-yocto-bsp \
        /home/syntro/work/edison/edison-src/device-software/meta-edison \
        /home/syntro/work/edison/edison-src/device-software/meta-edison-distro \
        /home/syntro/work/edison/edison-src/device-software/meta-edison-middleware \
        /home/syntro/work/edison/edison-src/device-software/meta-edison-arduino \
        /home/syntro/work/edison/edison-src/device-software/meta-edison-ii \
        \
        "

Then the usual "bitbake edison-image" should work and add the new features.
