## Shine - Voxy compatibility patch
Very basic Neoforge mod which patches Voxy's `renderOpaque` method, injecting Shine's `DhCompat` so Shine correctly disables its bloom render pass on LODs, fixing the excessive amounts of bloom on them on some system configurations.
\
(Note: I may be completely wrong since I only skimmed Shine's code briefly while writing this and am washed when it comes to programming so feel free to correct me if so)

## Building
No dependencies for building, just run `./gradlew build` to get the compat mod.
\
To run the compat under the development environment you need to provide your own Voxy jar, either by including it in the path specified by `voxy_jar` in `gradle.properties` or changing the path to a valid location containing it.
\
This compatibility patch was made specifically for [m3t4f1v3's fabric 1.21.1 backport of Voxy](https://github.com/m3t4f1v3/voxy/tree/mc_1211).
\
After including your own jar run `./gradlew runClient` inside of the main folder (make sure you are using Java 21+) and it should run the test client.

## Credits
- [MCRcortex](https://github.com/mcrcortex) for Voxy
- [m3t4f1v3](https://github.com/m3t4f1v3) for Voxy's 1.21.1 backport
- [tapeQz](https://github.com/tapeQz) for Shine
