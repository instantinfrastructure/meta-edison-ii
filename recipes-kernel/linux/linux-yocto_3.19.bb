KBRANCH ?= "master"

require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
COMPATIBLE_MACHINE = "edison"
LINUX_VERSION = "3.19.0"
SRCREV_machine = "eb74926920cfa756087a82e0b081df837177cb95"
SRCREV_meta = "6ad20f049abd52b515a8e0a4664861cfd331f684"

SRC_URI += "file://defconfig"
do_configure() {
  cp "${WORKDIR}/defconfig" "${B}/.config"
}
do_kernel_configme() {
  cp "${WORKDIR}/defconfig" "${B}/.config"
}

SRC_URI = "git://git.yoctoproject.org/linux-yocto-contrib.git;bareclone=1;branch=${KBRANCH},${KMETA};name=machine,meta"

LINUX_VERSION ?= "3.19.0"

PV = "${LINUX_VERSION}+git${SRCPV}"

KMETA = "meta"

COMPATIBLE_MACHINE = "edison"

# Functionality flags
KERNEL_EXTRA_FEATURES ?= "features/netfilter/netfilter.scc"
KERNEL_FEATURES_append = " ${KERNEL_EXTRA_FEATURES}"
KERNEL_FEATURES_append_qemux86=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append_qemux86-64=" cfg/sound.scc cfg/paravirt_kvm.scc"
KERNEL_FEATURES_append = " ${@bb.utils.contains("TUNE_FEATURES", "mx32", " cfg/x32.scc", "" ,d)}"

