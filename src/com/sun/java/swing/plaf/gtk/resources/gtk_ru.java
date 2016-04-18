/* This file is encoded as UTF-8 */

package com.sun.java.swing.plaf.gtk.resources;

import java.util.ListResourceBundle;

/**
 * <p>Resource bundle for the GTK+ Look and Feel with "ru" locale.</p>
 * <p>Composed using "gtk.properties" and "gtk_ja.properties" files from
 * "com.sun.java.swing.plaf.gtk.resources" package of OpenJDK 8 as
 * prototypes.</p>
 * <p>Currently, the following components need this for support:</p>
 * <ul>
 * <li>GTKColorChooserPanel</li>
 * <li>FileChooser</li>
 * </ul>
 * <p>MNEMONIC NOTE</p>
 * <p>Refer to the note in basic_ru.java for a description as to what the
 * mnemonics correspond to and how to calculate them.</p>
 * <p>NOTE</p>
 * <p>The following keys are not defined by the original default resource
 * bundle, though used by GTK+ in OpenJDK 8, so respective messages were
 * assigned arbitrarily:
 * <ul>
 *   <li>{@code FileChooser.newFolderButtonToolTip.textAndMnemonic}</li>
 *   <li>{@code FileChooser.deleteFileButtonToolTip.textAndMnemonic}</li>
 *   <li>{@code FileChooser.renameFileButtonToolTip.textAndMnemonic}</li>
 * </ul>
 * 
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class gtk_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // GTK color chooser properties:
//            { "GTKColorChooserPanel.textAndMnemonic", "&GTK Color Chooser" }, // &GTK Color Chooser
            { "GTKColorChooserPanel.hue.textAndMnemonic", "Оттенок (&H):" }, // &Hue:
            { "GTKColorChooserPanel.red.textAndMnemonic", "Красный (&E):" }, // R&ed:
            { "GTKColorChooserPanel.saturation.textAndMnemonic", "Насыщенность (&S):" }, // &Saturation:
            { "GTKColorChooserPanel.green.textAndMnemonic", "Зелёный (&G):" }, // &Green:
            { "GTKColorChooserPanel.value.textAndMnemonic", "Значение (&V):" }, // &Value:
            { "GTKColorChooserPanel.blue.textAndMnemonic", "Синий (&B):" }, // &Blue:
            { "GTKColorChooserPanel.color.textAndMnemonic", "Название цвета (&N):" }, // Color &Name:

            // ############ FILE CHOOSER STRINGS #############

            { "FileChooser.acceptAllFileFilter.textAndMnemonic", "Все файлы" }, // All Files
            { "FileChooser.newFolderButton.textAndMnemonic", "Новая папка (&N)" }, // &New Folder
            { "FileChooser.newFolderDialog.textAndMnemonic", "Имя папки:" }, // Folder name:
            { "FileChooser.newFolderNoDirectoryErrorTitle.textAndMnemonic", "Ошибка" }, // Error
            { "FileChooser.newFolderNoDirectoryError.textAndMnemonic", "Ошибка создания каталога \"{0}\": Не найден файл или каталог" }, // Error creating directory "{0}": No such file or directory
            { "FileChooser.deleteFileButton.textAndMnemonic", "Удалить файл (&L)" }, // De&lete File
            { "FileChooser.renameFileButton.textAndMnemonic", "Переименовать файл (&R)" }, // &Rename File
            { "FileChooser.cancelButton.textAndMnemonic", "Отмена" }, // Cancel
            { "FileChooser.saveButton.textAndMnemonic", "Сохранить" }, // OK
            { "FileChooser.openButton.textAndMnemonic", "Открыть" }, // OK
            { "FileChooser.saveDialogTitle.textAndMnemonic", "Сохранить" }, // Save
            { "FileChooser.openDialogTitle.textAndMnemonic", "Открыть" }, // Open
            { "FileChooser.pathLabel.textAndMnemonic", "Введите путь или название папки (&S):" }, // &Selection:
            { "FileChooser.filterLabel.textAndMnemonic", "Тип файла:" }, // Filter:
            { "FileChooser.foldersLabel.textAndMnemonic", "Папки (&D)" }, // Fol&ders
            { "FileChooser.filesLabel.textAndMnemonic", "Файлы (&F)" }, // &Files

            { "FileChooser.cancelButtonToolTip.textAndMnemonic", "Отменить выбор файла." }, // Abort file chooser dialog.
            { "FileChooser.saveButtonToolTip.textAndMnemonic", "Сохранить выбранный файл." }, // Save selected file.
            { "FileChooser.openButtonToolTip.textAndMnemonic", "Открыть выбранный файл." }, // Open selected file.

            { "FileChooser.renameFileDialog.textAndMnemonic", "Переименовать файл \"{0}\" в" }, // Rename file "{0}" to
            { "FileChooser.renameFileError.titleAndMnemonic", "Ошибка" }, // Error
            { "FileChooser.renameFileError.textAndMnemonic", "Ошибка переименования файла \"{0}\" в \"{1}\"" }, // Error renaming file "{0}" to "{1}"

            // extra items that were not present in the original
            // com.sun.java.swing.plaf.gtk.resources.gtk class, though used by
            // com.sun.java.swing.plaf.gtk.GTKFileChooserUI class
            { "FileChooser.newFolderButtonToolTip.textAndMnemonic", "Создать новую папку в текущей выбранной папке" },
            { "FileChooser.deleteFileButtonToolTip.textAndMnemonic", "Удалить текущий выбранный файл" },
            { "FileChooser.renameFileButtonToolTip.textAndMnemonic", "Переименовать текущий выбранный файл" },
        };
    }
}
