# DragonCastle

### Usage

Add The Following File to your app/libs/ directory
[dragon_chief.aar](https://github.com/electrodragon/DragonCastle/raw/master/releases/dragon_chief.aar)

Add this in your project level build.gradle under the ```repositories``` tag, which is nested under ```allprojects```.

```
flatDir {
     dirs 'libs/aars'
}
```

Add this in you app level build.gradle

```
implementation files('libs/dragon_chief.aar')
```