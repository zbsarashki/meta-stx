
SUMMARY = "InfluxDB is an open source time series platform"
DESCRIPTION = "\
InfluxDB is an open source time series platform. \
This includes APIs for storing and querying data, \
processing it in the background for ETL or monitoring \
and alerting purposes, user dashboards, and visualizing \
and exploring the data and more. \
"
HOMEPAGE = "https://www.influxdata.com/products/influxdb-overview/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://s3.amazonaws.com/influxdb/${BPN}_${PV}_x86_64.tar.gz"
SRC_URI[md5sum] = "da0cbcc5a521adc0e588327550441fbf"
SRC_URI[sha256sum] = "6d660007ca207f98eb847f4abf7f3060d1e6d239deeca9beaf833455a670fdb8"

S = "${WORKDIR}//${BPN}_${PV}_x86_64"

do_install() {
    cp -av --no-preserve=ownership ${S}/* ${D}/
}

INSANE_SKIP_${PN}_append = "already-stripped ldflags"
