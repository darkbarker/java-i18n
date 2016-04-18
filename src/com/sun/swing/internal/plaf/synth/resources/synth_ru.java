/* This file is encoded as UTF-8 */

package com.sun.swing.internal.plaf.synth.resources;

import java.util.ListResourceBundle;

/**
 * <p>Resource bundle for the Synth Look and Feel with "ru" locale.</p>
 * <p>
 * Composed using "synth.properties" and "synth_ja.properties" files from
 * "com.sun.swing.internal.plaf.synth.resources" package of OpenJDK 8 as
 * prototypes.</p>
 * <p>Currently, the following components need this for support:</p>
 * <ul>
 * <li>FileChooser</li>
 * </ul>
 * <p>MNEMONIC NOTE</p>
 * <p>Refer to the note in basic_ru.java for a description as to what the
 * mnemonics correspond to and how to calculate them.</p>
 * 
 * @author Steve Wilson
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class synth_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // ############ File chooser strings #############
            { "FileChooser.lookInLabel.textAndMnemonic", "Папка (&I)" }, // Look &In:
            { "FileChooser.saveInLabel.textAndMnemonic", "Сохранить в:" }, // Save In:
            { "FileChooser.fileNameLabel.textAndMnemonic", "Имя файла (&N):" }, // File &Name:
            { "FileChooser.folderNameLabel.textAndMnemonic", "Имя папки (&N):" }, // Folder &Name:
            { "FileChooser.filesOfTypeLabel.textAndMnemonic", "Тип файла (&T):" }, // Files of &Type:
            { "FileChooser.upFolderToolTip.textAndMnemonic", "Переход на один уровень вверх" }, // Up One Level
            { "FileChooser.upFolderAccessibleName", "Вверх" }, // Up
            { "FileChooser.homeFolderToolTip.textAndMnemonic", "Домашний каталог" }, // Home
            { "FileChooser.homeFolderAccessibleName", "Домашний каталог" }, // Home
            { "FileChooser.newFolderToolTip.textAndMnemonic", "Создание новой папки" }, // Create New Folder
            { "FileChooser.newFolderAccessibleName", "Новая папка" }, // New Folder
            { "FileChooser.newFolderActionLabel.textAndMnemonic", "Новая папка" }, // New Folder
            { "FileChooser.listViewButtonToolTip.textAndMnemonic", "Список" }, // List
            { "FileChooser.listViewButtonAccessibleName", "Список" }, // List
            { "FileChooser.listViewActionLabel.textAndMnemonic", "Список" }, // List
            { "FileChooser.detailsViewButtonToolTip.textAndMnemonic", "Таблица" }, // Details
            { "FileChooser.detailsViewButtonAccessibleName", "Таблица" }, // Details
            { "FileChooser.detailsViewActionLabel.textAndMnemonic", "Таблица" }, // Details
            { "FileChooser.refreshActionLabel.textAndMnemonic", "Обновить" }, // Refresh
            { "FileChooser.viewMenuLabel.textAndMnemonic", "Вид" }, // View
            { "FileChooser.fileNameHeader.textAndMnemonic", "Имя" }, // Name
            { "FileChooser.fileSizeHeader.textAndMnemonic", "Размер" }, // Size
            { "FileChooser.fileTypeHeader.textAndMnemonic", "Тип" }, // Type
            { "FileChooser.fileDateHeader.textAndMnemonic", "Изменён" }, // Modified
            { "FileChooser.fileAttrHeader.textAndMnemonic", "Атрибуты" }, // Attributes
        };
    }
}
