
FILESEXTRAPATHS_append:= ":${THISDIR}/linux:"

SRC_URI_append_poky-stx = " file://stx-kconfig.cfg"
SRC_URI_append_anaconda = " file://stx-anaconda-kconfig.cfg"

KERNEL_EXTRA_FEATURES_append = " \
    features/xfs/xfs.scc \
    features/iommu/iommu.scc \
    features/vfio/vfio.scc \
    cfg/debug/sched/debug-sched.scc \
    "
