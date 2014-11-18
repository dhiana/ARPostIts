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
    $ android update project --path . --target android-17

### Build

    # Skip commands as you wish...
    $ ant clean uninstall debug install
