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
    deps = [
        "@maven//:androidx_appcompat_appcompat",
        "@maven//:com_jakewharton_timber_timber",

         #  from firebase project
        "@maven//:androidx_activity_activity_compose",
        "@maven//:androidx_compose_foundation_foundation",
        "@maven//:androidx_compose_foundation_foundation_layout",
        "@maven//:androidx_compose_runtime_runtime",
        "@maven//:androidx_compose_ui_ui",
        "@maven//:androidx_compose_ui_ui_tooling",

         # my dependencies
        "@maven//:com_github_santalu_maskara",
#        "@maven//:com_github_mikephil_charting_chart",
#        "@maven//:com_github_PhilJay_MPAndroidChart",
    ],
)