inherit systemd
require fault-common.inc

SRC_URI += "file://0001-fm-mgr-Fix-install-target.patch"
S = "${S_DIR}/fm-mgr/sources"

DEPENDS += "fm-common"

EXTRA_OEMAKE = 'LDFLAGS="${LDFLAGS} -L${S}/fm-common/sources" \
		CCFLAGS="${CXXFLAGS}" \
		INCLUDES="-I. -I${S}/fm-common/sources" \
                BINDIR="${bindir}" \
		LIBDIR="${libdir}" \
                UNITDIR="${systemd_system_unitdir}" \
                DESTDIR="${D}" \
               '
do_install () {
	oe_runmake install
	# fix the path for init scripts
	sed -i -e 's|rc.d/||' ${D}/${systemd_system_unitdir}/*.service

	# fix the path for binaries
	sed -i -e 's|/usr/local/bin/|${bindir}/|' ${D}${sysconfdir}/init.d/fminit
}

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "fminit.service"
