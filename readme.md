java i18n

1) from jdk-source all implements ListResourceBundle

include:
com.sun.java.swing.plaf.gtk.resources.*
com.sun.java.swing.plaf.motif.resources.*
com.sun.java.swing.plaf.windows.resources.*

exclude com.sun.org.apache.* package:
com.sun.org.apache.xalan.internal.res.XSLTErrorResources*
com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages*
com.sun.org.apache.xalan.internal.xsltc.runtime.ErrorMessages*
com.sun.org.apache.xml.internal.res.XMLErrorResources*
com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages*
com.sun.org.apache.xml.internal.utils.res.XResources*
com.sun.org.apache.xpath.internal.res.XPATHErrorResources*

2) *.properties from openjdk7 (openjdk/jdk/src/share/classes)
-all of which are translated into other languages
-except that only translated in some languages ​​(e.g., ja+zh_CN or en+de)

include:
com/sun/java/swing/plaf/gtk/resources/gtk_ru.properties
com/sun/java/swing/plaf/motif/resources/motif_ru.properties
com/sun/java/swing/plaf/windows/resources/windows_ru.properties

com/sun/swing/internal/plaf/basic/resources/basic_ru.properties 
com/sun/swing/internal/plaf/metal/resources/metal_ru.properties
com/sun/swing/internal/plaf/synth/resources/synth_ru.properties 

sun/awt/resources/awt.properties
sun/print/resources/serviceui_ru.properties

exclude:
already translated (CalendarData, CurrencyNames, LocaleNames)
com/sun/accessibility/internal/resources/accessibility.properties 
com/sun/rowset/RowSetResourceBundle.properties
sun/launcher/resources/launcher.properties
sun/management/resources/agent.properties
sun/rmi/registry/resources/rmiregistry.properties
sun/rmi/server/resources/rmid.properties
sun/tools/jar/resources/jar.properties
sun/util/logging/resources/logging.properties

3) ...

* http://openjdk.java.net/groups/i18n/