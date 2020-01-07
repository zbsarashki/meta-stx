SUMMARY = "StarlingX python package group"

PR = "r0"

#
# packages which content depend on MACHINE_FEATURES need to be MACHINE_ARCH
#

PACKAGE_ARCH = "${MACHINE_ARCH}"
inherit packagegroup

PROVIDES = "${PACKAGES}"
PACKAGES = " \ 
	packagegroup-stx-python \
	"

#	python-cherrypy  # Conflicts with python3-cherrypy
	
RDEPENDS_packagegroup-stx-python = " \
	python-pygpgme \
	python-pyparted \
	python-docker-registry-core \
	python-flask-restful \
	python-traceback2 \
	python-typing \
	python-ujson \
	python-yappi \
	python-hp3parclient \
	python-click \
	python-linecache2 \
	python-slip-dbus \
	python-pymysql \
	python-xstatic-magic-search \
	python-pyperf \
	python-urwid \
	python-urlgrabber \
	python-pyelftools \
	python-pycurl \
	python-lefthandclient \
	python-jwcrypto \
	python-iniparse \
	python-ethtool \
	python-jmespath \
	python-beaker \
	python-d2to1 \
	python-firewall \
	python-ldap3 \
	python-pyngus \
	python-requests-oauthlib \
	python-versiontools \
	python-oslo.upgradecheck \
	python-configobj \
	python-django-debreach \
	python-google-auth \
	python-gunicorn \
	python-influxdb \
	python-ldappool \
	python-munch \
	python-aniso8601 \
	python-yaql \
	python-construct \
	python-yappi \
	python-selectors34 \
	python-pymisp \
	python-flask-sqlalchemy \
	python-pytest-tempdir \
	python-flask-migrate \
	python-robotframework \
	python-webencodings \
	python-flask-nav \
	python-humanize \
	python-unidiff \
	python-snakefood \
	python-traceback2 \
	python-pyusb \
	python-robotframework-seriallibrary \
	python-sijax \
	python-click \
	python-parse-type \
	python-semver \
	python-typing \
	python-flask-bcrypt \
	python-pynetlinux \
	python-pyfirmata \
	python-flask-babel \
	python-protobuf \
	python-slip-dbus \
	python-pycodestyle \
	python-blinker \
	python-pyalsaaudio \
	python-backports-abc \
	python-flask-script \
	python-flask-bootstrap \
	python-pybind11 \
	python-pydbus \
	python-lazy-object-proxy \
	python-crcmod \
	python-pytest-runner \
	python-pandas \
	python-flask-wtf \
	python-daemonize \
	python-wtforms \
	python-pyiface \
	pyrtm \
	python-bitarray \
	python-snimpy \
	python-pyjwt \
	python-hyperlink \
	python-sdnotify \
	python-vobject \
	python-serpent \
	python-speaklater \
	python-intervals \
	python-flask-mail \
	python-wcwidth \
	python-redis \
	python-grpcio-tools \
	python-flask-restful \
	python-javaobj-py3 \
	python-subprocess32 \
	python-constantly \
	python-pam \
	python-dbusmock \
	python-matplotlib \
	python-setuptools-scm \
	python-smbus \
	python-pyserial \
	python-imaging \
	python-flask-login \
	python-html5lib \
	python-flask-xstatic \
	python-flask-uploads \
	python-inflection \
	python-twofish \
	python-flask-user \
	python-behave \
	python-sparts \
	python-epydoc \
	python-feedparser \
	python-pyrex \
	python-progress \
	python-can \
	python-vcversioner \
	python-paho-mqtt \
	python-grpcio \
	python-xlrd \
	python-visitor \
	python-pyflame \
	python-numeric \
	python-cheetah \
	python-flask-sijax \
	python-webdav \
	python-flask-pymongo \
	python-prompt-toolkit \
	python-djangorestframework \
	python-linecache2 \
	python-parse \
	python-feedformatter \
	python-pybluez \
	python-gdata \
	python-whoosh \
	python-ujson \
	python-flask-navigation \
	python-pystache \
	python-systemd \
	python-pyhamcrest \
	python-webcolors \
	python-django-south \
	pamela \
	python-aws-iot-device-sdk-python \
	python-isort \
	python-periphery \
	python-pytest-helpers-namespace \
	python-dominate \
	python-pygpgme \
	python-evdev \
	python3-linux-procfs \
	python-murano-pkg-check \
	python-oslo.upgradecheck \
	python-configshell \
	"