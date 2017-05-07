include recipes-core/images/rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-dropbear "

IMAGE_INSTALL += " nano linux-firmware oracle-jse-jre mongodb hostapd iw wpa-supplicant dnsmasq "

DISTRO_FEATURES_append += " wifi"

ENABLE_UART = "1"