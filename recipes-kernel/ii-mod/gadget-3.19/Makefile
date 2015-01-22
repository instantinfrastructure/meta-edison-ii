#
# USB peripheral controller drivers
#
subdir-ccflags-$(CONFIG_USB_GADGET_DEBUG)	:= -DDEBUG
subdir-ccflags-$(CONFIG_USB_GADGET_VERBOSE)	+= -DVERBOSE_DEBUG
ccflags-y				+= -I$(srctree)/drivers/usb/gadget/udc

obj-$(CONFIG_USB_LIBCOMPOSITE)	+= libcomposite.o
libcomposite-y			:= usbstring.o config.o epautoconf.o
libcomposite-y			+= composite.o functions.o configfs.o u_f.o

obj-$(CONFIG_USB_GADGET)	+= udc/ function/ legacy/
KDIR := /shared/edison-src/build/tmp/work/edison-poky-linux/linux-yocto/3.10.17+gitAUTOINC+6ad20f049a_c03195ed6e-r0/sysroot-destdir/usr/src/kernel/
KDIR := /shared/edison-src/build/tmp/sysroots/edison/usr/src/kernel/
PWD := /shared/edison-src/device-software/meta-edison-ii/recipes-kernel/ii-mod/gadget-3.19
#obj-m := gadgetfs.o usb_f_serial.o usb_f_ss_lb.o usb_f_acm.o usb_f_obex.o
obj-m := libcomposite.o
ccflags-y += -I$(PWD)/udc
default:
	$(MAKE) -C $(KDIR) SUBDIRS=$(PWD) modules
