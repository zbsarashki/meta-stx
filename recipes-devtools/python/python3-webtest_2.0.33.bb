
DESCRIPTION = "This wraps any WSGI application and makes it easy to send test requests to that application, without starting up an HTTP server."
HOMEPAGE = "https://pypi.python.org/pypi/WebTest/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.rst;md5=64f013a9d7a2a8ffc8d016a2d4214bcd"

PYPI_PACKAGE = "WebTest"

RDEPENDS_${PN} += "${PYTHON_PN}-beautifulsoup4"

SRC_URI[md5sum] = "dd0385c725b85ac1e8079f38d2acd7b1"
SRC_URI[sha256sum] = "41348efe4323a647a239c31cde84e5e440d726ca4f449859264e538d39037fd0"
inherit setuptools3 pypi
