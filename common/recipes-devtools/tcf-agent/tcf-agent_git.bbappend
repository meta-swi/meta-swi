INITSCRIPT_PARAMS = "start 84 S . stop 16 S ."

# Look for files in the layer first
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://tcf-agent.init \
            file://legato_identify.patch \
           "

# Prevent dependency on bash
RDEPENDS_${PN} = ""
CFLAGS += " -DTERMINALS_NO_LOGIN=0"