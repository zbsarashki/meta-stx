#
## Copyright (C) 2019 Wind River Systems, Inc.
#
#  Licensed under the Apache License, Version 2.0 (the "License");
#  you may not use this file except in compliance with the License.
#  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
#  Unless required by applicable law or agreed to in writing, software
#  distributed under the License is distributed on an "AS IS" BASIS,
#  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#  See the License for the specific language governing permissions and
#  limitations under the License.

SUMMARY = "Read metadata from Python packages"
DESCRIPTION = "Read metadata from Python packages"
HOMEPAGE = "https://pypi.org/project/importlib-metadata/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

SRC_URI[md5sum] = "80d677d744995336c9c22d21a85ddeb8"
SRC_URI[sha256sum] = "aa18d7378b00b40847790e7c27e11673d7fed219354109d0e7b9e5b25dc3ad26"

DEPENDS += "${PYTHON_PN}-setuptools-scm-native"

PYPI_PACKAGE = "importlib_metadata"

inherit pypi setuptools

S = "${WORKDIR}/importlib_metadata-${PV}"

RDEPENDS_${PN} += "\
    ${PYTHON_PN}-zipp \
    ${PYTHON_PN}-pathlib2 \
    python-compression \
    python-configparser \
    python-contextlib2 \
    python-pathlib2 \
"

BBCLASSEXTEND = "native nativesdk"
