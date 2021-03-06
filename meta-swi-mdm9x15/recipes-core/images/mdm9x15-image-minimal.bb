DESCRIPTION = "A small image just capable of allowing SWI mdm9x15 to boot."

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE = "8192"

require mdm9x15-image.inc

PR = "${INC_PR}.0"

rootfs_symlink() {
    # Provide minimal image as rootfs symlink
    ln -sf ${IMAGE_NAME}.rootfs.4k.yaffs2 ${DEPLOY_DIR_IMAGE}/rootfs
}

do_rootfs[postfuncs] += "rootfs_symlink"

