## Shine - Voxy compatibility patch
Very basic Neoforge mod which patches Voxy so Shine correctly disables its features on LODs, fixing the excessive amounts of bloom on them on some system configurations.
\
(Note: I may be completely wrong since I only skimmed Shine's code briefly while writing this and am washed when it comes to programming so feel free to correct me if so)

## Building
To build the mod you need to provide your own Voxy jar, either by including it in the path specified by `voxy_jar` in `gradle.properties` or changing the path to a valid location containing it.
\
This compatibility patch was made specifically for [m3t4f1v3's fabric 1.21.1 backport of Voxy](https://github.com/m3t4f1v3/voxy/tree/mc_1211).
\
After including your own jar run `./gradlew build` inside of the main folder (make sure you are using Java 21+) and it should build without any issues.

## Credits
- [MCRcortex](https://github.com/mcrcortex) for Voxy
- [m3t4f1v3](https://github.com/m3t4f1v3) for Voxy's 1.21.1 backport
- [tapeQz](https://github.com/tapeQz) for Shine
