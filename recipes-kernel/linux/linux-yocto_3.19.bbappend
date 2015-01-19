FILESEXTRAPATHS_prepend := "${THISDIR}/linux-yocto-ii:"
#COMPATIBLE_MACHINE = "edison"
#LINUX_VERSION = "3.19.0"
#SRCREV_machine = "eb74926920cfa756087a82e0b081df837177cb95"
#SRCREV_meta = "6ad20f049abd52b515a8e0a4664861cfd331f684"

SRC_URI += "file://defconfig"

#do_configure() {
#  cp "${WORKDIR}/defconfig" "${B}/.config"
#}
#do_kernel_configme() {
#  cp "${WORKDIR}/defconfig" "${B}/.config"
#}

#SRC_URI += "file://upstream_to_edison.patch"
#do_patch() {
#  cd ${S}
#  git am "${WORKDIR}/upstream_to_edison.patch"
#}

