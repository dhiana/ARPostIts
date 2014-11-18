ARPostIts
=========

Post-its gone Augmented Reality!

Setting up!
-----------

### Update PATH at ~/.bashrc

    # Android development example path
    export ANDROID_ROOT=$HOME/Devel/Android/
    export ADB_ROOT=$ANDROID_ROOT/ADT/adt-bundle-linux-x86_64-20140702/
    export PATH=$ADB_ROOT/sdk/tools/:$PATH
    export PATH=$ADB_ROOT/sdk/platform-tools/:$PATH

### Downloads SDK's

    $ android update sdk --no-ui

### Setup local environment

    # Creates local.properties and proguard-project.txt
    $ android update project --path .

### Build

    # Creates bin/ARPostIts-debug.apk
    $ ant debug

### Deploy

    # From scratch
    $ adb install bin/ARPostIts-debug.apk

    # Or, update
    $ adb install -r bin/ARPostIts-debug.apk

    # If needed, uninstall
    $ adb uninstall com.qualcomm.vuforia.samples.VuforiaSamples
