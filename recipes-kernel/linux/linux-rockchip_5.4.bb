# Copyright (C) 2019, Fuzhou Rockchip Electronics Co., Ltd
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-yocto.inc
require recipes-kernel/linux/linux-rockchip.inc

SRCREV = "21c98f7e1574ca1547972973628625eb7713ce5d"

SRC_URI = " \
        git://github.com/torvalds/linux.git \
"

# git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=linux-5.4.y \
#
KERNEL_VERSION_SANITY_SKIP="1"
LINUX_VERSION = "5.4.27"

