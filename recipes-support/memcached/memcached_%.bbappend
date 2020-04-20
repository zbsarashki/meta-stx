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

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://memcached.sysconfig"

inherit useradd

USERADD_PACKAGES = "${PN}"

USERADD_PARAM_${PN} = "-r -g memcached -d /run/memcached -s /sbin/nologin -c 'Memcached daemon' memcached"
GROUPADD_PARAM_${PN} = "-r memcached"

do_install_append () {
    install -d ${D}${sysconfdir}/sysconfig
    install -m 0644 ${WORKDIR}/memcached.sysconfig ${D}${sysconfdir}/sysconfig/memcached
}
