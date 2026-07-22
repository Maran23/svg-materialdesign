# SVG Material Design

A collection of all [Material Design](https://pictogrammers.com/library/mdi/) SVG icon paths as Java enum constants – ready to be used in any Java program.

![Material Design](https://github.com/Maran23/svgnode/blob/demo/demo/library_materialdesign.webp)

## Features

- 🎨 All Material Design icons as Java enums
- 🔗 No dependencies
- 📐 Designed as a companion library for [SvgNode](https://github.com/Maran23/svgnode) for use in JavaFX applications – but works in any Java context

## Installation

### Requirements

| Dependency | Version |
|------------|---------|
| Java       | 25+     |

### Maven

```xml
<dependency>
    <groupId>tools.maran</groupId>
    <artifactId>svg-materialdesign</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

```groovy
implementation 'tools.maran:svg-materialdesign:1.0.0'
```

## Usage

### Pure Java

```java
import tools.maran.svg.materialdesign.MDIInterface;

String path = MDIInterface.HOME.path();
```

#### With the SVG type

```java
import tools.maran.svg.SVG;
import tools.maran.svg.materialdesign.MDIInterface;
import tools.maran.svg.materialdesign.MDIWorld;

SVG svg = MDIInterface.HOME;
// Switch from interface to world SVG.
svg = MDIWorld.HOME_CITY;
```

### Usage with [SvgNode](https://github.com/Maran23/svgnode)

#### Java

```java
import tools.maran.svgnode.SvgNode;
import tools.maran.svg.materialdesign.MDIInterface;

SvgNode node = new SvgNode(MDIInterface.HOME, 32);
```
#### FXML

```xml
<?import tools.maran.svgnode.SvgNode?>
<?import tools.maran.svg.materialdesign.MDIInterface?>

<SvgNode size="32" color="RED">
    <path>
        <MDIInterface fx:constant="HOME"/>
    </path>
</SvgNode>
```

## Acknowledgements

This project includes SVG icon data from [Material Design](https://pictogrammers.com/library/mdi/),
licensed under [Apache 2.0 license](https://github.com/Templarian/MaterialDesign/blob/master/LICENSE).
