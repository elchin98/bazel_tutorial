package(
    default_visibility = ["//src:__subpackages__"],
)

load("@rules_android//android:rules.bzl","android_library")

android_library(
    name = "greeter_activity",
    srcs = [
        "Greeter.java",
        "MainActivity.java",
    ],
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
#    visibility = ["//:__pkg__"],
    deps = [
        "@maven//:com_jakewharton_timber_timber",
#        "@maven//:androidx_appcompat_appcompat",
#        "@maven//:androidx_core_core_ktx",
        "@maven//:com_github_santalu_maskara",
#         "@maven//:com_google_android.material",
#        "@maven//:com_github_mikephil_charting_chart"
    ],
)