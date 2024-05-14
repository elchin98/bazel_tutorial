load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")


http_archive(
    name = "rules_android",
    sha256 = "cd06d15dd8bb59926e4d65f9003bfc20f9da4b2519985c27e190cddc8b7a7806",
    strip_prefix = "rules_android-0.1.1",
    urls = ["https://github.com/bazelbuild/rules_android/archive/v0.1.1.zip"],
)


android_sdk_repository(
    name = "androidsdk"
)

RULES_JVM_EXTERNAL_TAG = "5.3"

RULES_JVM_EXTERNAL_SHA = "d31e369b854322ca5098ea12c69d7175ded971435e55c18dd9dd5f29cc5249ac"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url =
    "https://github.com/bazelbuild/rules_jvm_external/releases/download/%s/rules_jvm_external-%s.tar.gz" % (RULES_JVM_EXTERNAL_TAG, RULES_JVM_EXTERNAL_TAG)
)

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [

        # from firebase
        "androidx.appcompat:appcompat:1.5.1",

        # Jetpack Compose Dependencies
        "androidx.activity:activity-compose:1.6.0",
        "androidx.compose.material:material:1.2.1",
        "androidx.compose.ui:ui:1.2.1",
        "androidx.compose.ui:ui-tooling:1.2.1",
        "androidx.compose.compiler:compiler:1.3.2",
        "androidx.compose.runtime:runtime:1.2.1",

        # Dependencies needed to manage version conflicts
        "androidx.core:core:1.6.0",
        "androidx.core:core-ktx:1.6.0",
        "androidx.savedstate:savedstate-ktx:1.2.0",
        "androidx.savedstate:savedstate:1.2.0",
        "androidx.lifecycle:lifecycle-livedata-core-ktx:2.5.1",
        "androidx.lifecycle:lifecycle-livedata-core:2.5.1",
        "androidx.lifecycle:lifecycle-livedata:2.5.1",
        "androidx.lifecycle:lifecycle-process:2.5.1",
        "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1",
        "androidx.lifecycle:lifecycle-runtime:2.5.1",
        "androidx.lifecycle:lifecycle-service:2.5.1",
        "androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1",
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:2.5.1",
        "androidx.lifecycle:lifecycle-viewmodel:2.5.1",

         # my dependencies
        "com.github.santalu:maskara:1.0.0",
        "com.jakewharton.timber:timber:5.0.1",
#        "com.github.PhilJay:MPAndroidChart:v3.1.0",
#        "com.github.mikephil:charting:v3.1.0",
    ],
    repositories = [
        "https://repo.maven.apache.org/maven2",
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
        "https://jitpack.io"
    ],
    version_conflict_policy = "pinned"
)
