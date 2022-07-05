[![Contributors][contributors-shield]][contributors-url]
[![Forks][forks-shield]][forks-url]
[![Stargazers][stars-shield]][stars-url]
[![Issues][issues-shield]][issues-url]
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]

<!-- PROJECT LOGO -->
<br />
<p align="center">
  <a href="https://github.com/jihedkdiss/jColors">
    <img src="https://github.com/jihedkdiss/jColors/blob/main/Pictures/Logo.png" alt="Logo" width="100" height="100">
  </a>

  <h3 align="center">jColors 🎨 Library</h3>

  <p align="center">
    Colorful output library for Java
    <br />
    <a href="https://github.com/jihedkdiss/jColors"><strong>Explore the repository »</strong></a>
    <br />
    <br />
    <a href="https://github.com/jihedkdiss/jColors">View Code</a>
    ·
    <a href="https://github.com/jihedkdiss/jColors/issues">Report Bug</a>
    ·
    <a href="https://github.com/jihedkdiss/jColors/issues">Request Feature</a>
  </p>
</p>

<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
      <li><a href="#features">Features</a></li>
      <li><a href="#available-styles">Available Styles</a></li>
      <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#compiling">Compiling</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

![jColors Screenshot](https://raw.githubusercontent.com/jihedkdiss/jColors/main/Pictures/Screenshot.png)

<b>jColors</b> is a lightweight Java library to make printing colored output to the console super easy.
Unlike many libraries that provide this feature but with hard syntax or limited abilities, jColors provides you with full capabilities.
The library is fully coded in Java and the syntax is easy to understand and very intuitive.

### Features

* Runs on any type of console/terminal (even cmd on Windows out of the box!)
* Easy to integrate with your projects, just add the necessary .jar files and you're all set!
* Wide range of styles, colors and background colors!
* You can read input in colors and styles as well! (not only output)
* You can make your own combinations (use many styles together)

### Available styles

* Styles: normal, bold, underline, inverse.
* Foreground colors: black, red, green, yellow, blue, magenta, cyan, white (+ strong variations)
* Background colors: black, red, green, yellow, blue, magenta, cyan, white (+ strong variations)
* Input colors: black, red, green, yellow, blue, magenta, cyan, white

> You can try run the Main.java program to get a look at all available styles in action.

### Built With

* [Java](https://www.java.com/)
* [JNA Platform](https://github.com/java-native-access/jna)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- GETTING STARTED -->
## Getting Started

jColors is simple and easy to use by design. Setting up jColors in your project takes only a few clicks, and you'll enjoy hundreds of styles.

### Prerequisites

This library relies on the JNA (Java Native Access) library. Make sure to [download JNA](https://github.com/java-native-access/jna) and add it to your classpath before running jColors in your project.
* jna-version.jar
* jna-platform-version.jar

### Installation

_To integrate jColors in your project, you can either add the .jar files to your IDE or add them to your classpath if you want to compile it by yourself._

1. Import jColors
   ```java
   import jcolors.*;
   ```
2. Setup Windows CMD compatibility (optional)
   ```java
   jcolors.setup();
   ```
3. Print your first colored output!
   ```java
   System.out.println(fgColors.yellow("We did it!!"));
   ```
4. Read your first colored input!
   ```java
   inputColorsStrong.cyan();
   System.out.print(">> ");
   String input = input.nextLine();
   inputColorsStrong.close();
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

## Compiling

To compile & run your java files using the jColors Library manually from the cmd use the next command.
```sh
   javac -classpath "jcolors/library/location;jna/library/location/jna/platform/library/location" Class.java
   java -classpath "project/location;jcolors/location;jna/location/jna/platform/location" package.Class
   ```

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/jihedkdiss/jColors/issues) for a list of proposed features (and known issues).

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- LICENSE -->
## License

Distributed under the GNU General Public License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Jihed Kdiss - [@jiokdiss](https://facebook.com/jiokdiss) - jihedkdiss@outlook.com

Project Link: [https://github.com/jihedkdiss/jColors](https://github.com/jihedkdiss/jColors)

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/jihedkdiss/jColors.svg?style=for-the-badge
[contributors-url]: https://github.com/jihedkdiss/jColors/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/jihedkdiss/jColors.svg?style=for-the-badge
[forks-url]: https://github.com/jihedkdiss/jColors/network/members
[stars-shield]: https://img.shields.io/github/stars/jihedkdiss/jColors.svg?style=for-the-badge
[stars-url]: https://github.com/jihedkdiss/jColors/stargazers
[issues-shield]: https://img.shields.io/github/issues/jihedkdiss/jColors.svg?style=for-the-badge
[issues-url]: https://github.com/jihedkdiss/jColors/issues
[license-shield]: https://img.shields.io/github/license/jihedkdiss/jColors.svg?style=for-the-badge
[license-url]: https://github.com/jihedkdiss/jColors/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/jihedkdiss
