# ModernUI Suite

## Notice on Archival
As of the 12th of March, this mod will no longer be updated or maintained - Anyone is free to get in touch and fork this if they wish :)

A Minecraft mod which allows players to change their cape and skin directly from an in-game menu. Skins can be retrieved from files, urls and directly from player names and UUIDs.

-----------


A series of UI utilities which I use in my mods. 

### How to build

#### Eclipse
1. Clone the repo: `git clone https://github.com/boomboompower/ModernUI`
2. Copy in the `eclipse/` folder from a fresh installation of the [Forge MDK](http://files.minecraftforge.net)
3. Run `./gradlew setupDecompWorkspace eclipse`
4. Open the project in Eclipse
5. Run `./gradlew build` to build the mod
6. Run the installer

#### IntelliJ IDEA
1.  Clone the repo: `git clone
    https://github.com/boomboompower/ModernUI`
2. Run `./gradlew setupDecompWorkspace idea genIntellijRuns`
3. Open the project in IntelliJ
4. Import the gradle project, sync gradle
5. Run `./gradlew build` to build the mod

### Please Note
This is not meant to be placed in your mods directory (it's meant to be compiled with inside the mod).
