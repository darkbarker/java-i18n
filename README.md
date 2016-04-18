<!--
This document is authored using GitHub Flavored Markdown:
https://help.github.com/articles/basic-writing-and-formatting-syntax/
-->

# java i18n

Translations of OpenJDK / JDK standard resources to languages that are missing
from official distributions. Only selected resources are translated, mainly GUI
(Swing and AWT).

Currently translated to:
* ru

## Background

Oracle JDK and OpenJDK offer localizations to a number of languages, and still
there are more languages that are not immediately supported.

There is no big problem for an application programmer to have the messages of
his own localized to any language, but localization of standard dialogs like
[`JFileChooser`](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFileChooser.html)
is the next level of challenge.

Still, as Oracle JDK and OpenJDK do provide sources for the internationalization
(i18n) resources, it is possible to add more translations to these resources.

## Approach

I18n of standard UI components and messages is normally achieved via
[resource bundles](https://docs.oracle.com/javase/8/docs/api/java/util/ResourceBundle.html)
that are implemented by
[`PropertyResourceBundle`](https://docs.oracle.com/javase/8/docs/api/java/util/PropertyResourceBundle.html)
or
[`ListResourceBundle`](https://docs.oracle.com/javase/8/docs/api/java/util/ListResourceBundle.html).

When it comes to i18n of standard UI components, `PropertyResourceBundle`s are
mainly used in
[OpenJDK main repository](http://hg.openjdk.java.net/jdk8u/hs-dev/jdk/),
while `ListResourceBundle`s are used in Oracle JDK sources and also in some
OpenJDK forks like
[Ubuntu OpenJDK](http://packages.ubuntu.com/vivid/all/openjdk-8-source/download).
Both resource bundle formats work equally well and are perfectly
interchangeable, at least as long as we deal with string data. Still
when it comes to different scripts, `ListResourceBundle` format
looks more Unicode friendly, as it does not require escaping.

Thus in order to add a new language to standard UI components, it is possible
just to create a set of extra resource bundles and add them to the JVM
configuration. And there is a standard technology for adding extensions to a
JVM: the
[`jre/lib/ext` folder](http://docs.oracle.com/javase/8/docs/technotes/tools/findingclasses.html#extclass).

The [`darkbarker/java-i18n`](https://github.com/darkbarker/java-i18n) project,
the predecessor to this one, used a mixed (`ListResourceBundle` /
`PropertyResourceBundle`) approach. That approach, though sufficient to do the
job, still requires extra tools for rendering escaped property values while
development and is thus arguably convenient for customizations.

This current project uses `ListResourceBundle` throughout consistently. And the
data is updated to fit JDK 8 amendments, with original OpenJDK resource
structure retained as much as possible.

## Prerequisites

The supplied binary build requires Java 1.5, though nothing prevents the source
code from being compiled with any `javac` version since 1.1.

## Versioning

Artifact/build versions are currently formatted like "YYYYMMDD" rather than
using semantic versioning, as no versioning policy has evolved so far.

## Building

A [`build.xml`](build.xml) file for Ant build is available.

## Distributions

The following distribution types are available:
- JARs with localized data for individual languages:
  - `java-i18n-YYYYMMDD-usn-ru.jar`
- JARs with localized data for all languages:
  - `java-i18n-YYYYMMDD-usn-all.jar`
- source distribution:
  - `java-i18n-YYYYMMDD-usn-src.zip`

<!-- NOTE '../../' below compensate 'blob/master/' that is otherwise added by
          GitHub
          -->
The latest release can be found [here](../../releases/latest).

## License

The project is issued and distributed under
[GPLv2 license with classpath exception](LICENSE.GPLv2+CE.txt) according to the
oririnal [OpenJDK license](http://openjdk.java.net/legal/gplv2+ce.html).

## Usage – HOW-TO

- download or build the latest `java-i18n-YYYYMMDD-usn-all.jar` file or any of
  the individual `java-i18n-YYYYMMDD-usn-??.jar` files and add it
  to the `jre/lib/ext` folder of the JRE that you use;
- enjoy :)

## See also

- [darkbarker java-i18n project](https://github.com/darkbarker/java-i18n) - the
ancestor of this project
- [OpenJDK: The Internationalization and Localization Group](http://openjdk.java.net/groups/i18n/)

## Extras

### Replacement patterns for conversion of .properties format to .java format
- convert empty comment lines to plain empty lines: find `^[\s&&[^\n]]*#$`,
replace with empty string
- convert non-empty comment lines: find `^[\s&&[^\n]]*#[\s&&[^\n]]?([^\n]+)$`,
replace with `\            // $1`
- convert property key/value pairs: find `^([^=\n]+)\s*=\s*(.*)$`,
replace with `\            { "$1", "$2" }, // $2`
- extract mnemonics in converted values: find `, "[^&"]*(&.)[^"]*?(:?)"`,
replace with `, " ($1)$2"`
