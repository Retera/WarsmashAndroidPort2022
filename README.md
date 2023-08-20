# Warsmash3Phone

This project is NOT UNDER ACTIVE DEVELOPMENT and will NOT be supported!

This project is a 2022 parody of Warsmash created by Retera originally in private that is capable of running on some Android devices.
In the summer of 2022, after the Arclight Rumble Mobile for Warcraft was announced, as a form of self-parody or perhaps dark humor I ported the work in progress Java based Warcraft 3 emulator "Warsmash" so that it would run on Android devices.
This allowed me to create YouTube videos of myself holding a phone with what would appear to be Warcraft 3 on the phone in private, mostly to make parody videos about Arclight Rumble such as the following (Warning: video contains explicit language!):
[![GAMEPLAY VIDEO](http://img.youtube.com/vi/oE8-DJ2EhYs/0.jpg)](https://www.youtube.com/watch?v=oE8-DJ2EhYs)


A [libGDX](https://libgdx.com/) project generated with [gdx-liftoff](https://github.com/tommyettinger/gdx-liftoff).

This project was generated with a template including simple application launchers and an `ApplicationAdapter` extension that draws libGDX logo.

## Gradle

This project uses [Gradle](http://gradle.org/) to manage dependencies.
The Gradle wrapper was included, so you can run Gradle tasks using `gradlew.bat` or `./gradlew` commands.
Useful Gradle tasks and flags:

- `--continue`: when using this flag, errors will not stop the tasks from running.
- `--daemon`: thanks to this flag, Gradle daemon will be used to run chosen tasks.
- `--offline`: when using this flag, cached dependency archives will be used.
- `--refresh-dependencies`: this flag forces validation of all dependencies. Useful for snapshot versions.
- `android:lint`: performs Android project validation.
- `build`: builds sources and archives of every project.
- `cleanEclipse`: removes Eclipse project data.
- `cleanIdea`: removes IntelliJ project data.
- `clean`: removes `build` folders, which store compiled classes and built archives.
- `eclipse`: generates Eclipse project data.
- `idea`: generates IntelliJ project data.
- `lwjgl3:jar`: builds application's runnable jar, which can be found at `lwjgl3/build/libs`.
- `lwjgl3:run`: starts the application.
- `test`: runs unit tests (if any).

Note that most tasks that are not specific to a single project can be run with `name:` prefix, where the `name` should be replaced with the ID of a specific project.
For example, `core:clean` removes `build` folder only from the `core` project.
