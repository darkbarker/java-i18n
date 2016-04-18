/* This file is encoded as UTF-8 */

package com.sun.swing.internal.plaf.basic.resources;

import java.util.ListResourceBundle;

/**
 * Resource bundle for Swing Look and Feels with "ru" locale.
 * <p>
 * Composed using "basic.properties" and "basic_ja.properties" files from
 * "com.sun.swing.internal.plaf.basic.resources" package of OpenJDK 8 as
 * prototypes.</p>
 * <p>Currently, the following components need this for support:</p>
 * <ul>
 * <li>ColorChooser</li>
 * <li>FileChooser</li>
 * <li>OptionPane</li>
 * </ul>
 * <p>MNEMONIC NOTE</p>
 * <p>Many of strings in this file are used by widgets that have a mnemonic, for
 * example:</p>
 * <pre>"ColorChooser.rgbNameTextAndMnemonic", "R&amp;GB" },</pre>
 * <p>indicates that the tab in the {@code ColorChooser} for RGB colors will
 * have the text 'RGB', further the mnemonic character will be 'g' and that a
 * decoration will be provided under the 'G'. This will typically look like:</p>
 * <pre>R<u>G</u>B</pre>
 * <p>One important thing to remember is that the mnemonic MUST exist in the
 * {@code String}, if it does not exist you should add text that makes it exist.
 * This will typically take the form 'XXXX (M)' where M is the character for the
 * mnemonic.</p>
 * 
 * @author Steve Wilson
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class basic_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            // ############ FILE CHOOSER STRINGS #############
            { "FileChooser.fileDescription.textAndMnemonic", "Файл" }, // Generic File
            { "FileChooser.directoryDescription.textAndMnemonic", "Каталог" }, // Directory
            { "FileChooser.newFolderError.textAndMnemonic", "Ошибка создания новой папки" }, // Error creating new folder
//            { "FileChooser.newFolderErrorSeparator", ":" }, // : 
            { "FileChooser.newFolderParentDoesntExistTitle.textAndMnemonic", "Невозможно создать папку" }, // Unable to create folder
            { "FileChooser.newFolderParentDoesntExist.textAndMnemonic", "Невозможно создать папку.\n\nСистема не может найти указанный путь." }, // Unable to create the folder.\n\nThe system cannot find the path specified.
            { "FileChooser.renameErrorTitle.textAndMnemonic", "Ошибка переименования файла или папки" }, // Error Renaming File or Folder
            { "FileChooser.renameError.textAndMnemonic", "Невозможно переименовать {0}" }, // Cannot rename {0}
            { "FileChooser.renameErrorFileExists.textAndMnemonic", "Невозможно переименовать {0}: Файл с указанным именем уже существует.\nУкажите другое имя файла." }, // Cannot rename {0}: A file with the name you specified already exists. \nSpecify a different file name.
            { "FileChooser.acceptAllFileFilter.textAndMnemonic", "Все файлы" }, // All Files
            { "FileChooser.cancelButton.textAndMnemonic", "Отмена" }, // Cancel
            { "FileChooser.saveButton.textAndMnemonic", "Сохранить" }, // Save
            { "FileChooser.openButton.textAndMnemonic", "Открыть" }, // Open
            { "FileChooser.saveDialogTitle.textAndMnemonic", "Сохранить" }, // Save
            { "FileChooser.openDialogTitle.textAndMnemonic", "Открыть" }, // Open
            { "FileChooser.updateButton.textAndMnemonic", "Обновить (&U)" }, // &Update
            { "FileChooser.helpButton.textAndMnemonic", "Помощь (&H)" }, // &Help
            { "FileChooser.directoryOpenButton.textAndMnemonic", "Открыть" }, // Open

            // File Size Units
            { "FileChooser.fileSizeKiloBytes", "{0} КБ" }, // {0} KB
            { "FileChooser.fileSizeMegaBytes", "{0} МБ" }, // {0} MB
            { "FileChooser.fileSizeGigaBytes", "{0} ГБ" }, // {0} GB

            // These strings are platform dependent, not look and feel dependent.
            { "FileChooser.win32.newFolder", "Новая папка" }, // New Folder
            { "FileChooser.win32.newFolder.subsequent", "Новая папка ({0})" }, // New Folder ({0})
            { "FileChooser.other.newFolder", "НоваяПапка" }, // NewFolder
            { "FileChooser.other.newFolder.subsequent", "НоваяПапка.{0}" }, // NewFolder.{0}

            // ## file chooser tooltips ###
            { "FileChooser.cancelButtonToolTip.textAndMnemonic", "Закрыть диалог выбора файла" }, // Abort file chooser dialog
            { "FileChooser.saveButtonToolTip.textAndMnemonic", "Сохранить выбранный файл" }, // Save selected file
            { "FileChooser.openButtonToolTip.textAndMnemonic", "Открыть выбранный файл" }, // Open selected file
            { "FileChooser.updateButtonToolTip.textAndMnemonic", "Обновить содержимое каталога" }, // Update directory listing
            { "FileChooser.helpButtonToolTip.textAndMnemonic", "Вызов справки" }, // FileChooser help
            { "FileChooser.directoryOpenButtonToolTip.textAndMnemonic", "Открыть выбранный каталог" }, // Open selected directory
            { "FileChooser.filesListAccessibleName", "Список" }, // Files List
            { "FileChooser.filesDetailsAccessibleName", "Таблица" }, // Files Details

            // ############ COLOR CHOOSER STRINGS #############
            { "ColorChooser.preview.textAndMnemonic", "Просмотр" }, // Preview
//            { "ColorChooser.ok.textAndMnemonic", "OK" }, // OK
            { "ColorChooser.cancel.textAndMnemonic", "Отмена" }, // Cancel
            { "ColorChooser.reset.textAndMnemonic", "Сброс (&R)" }, // &Reset
            { "ColorChooser.sample.textAndMnemonic", "Пример Текста  Пример Текста" }, // Sample Text  Sample Text
            { "ColorChooser.swatches.textAndMnemonic", "Палитра (&S)" }, // &Swatches
            { "ColorChooser.swatchesRecent.textAndMnemonic", "Последние:" }, // Recent:
//            { "ColorChooser.hsv.textAndMnemonic", "&HSV" }, // &HSV
            { "ColorChooser.hsvHue.textAndMnemonic", "Оттенок" }, // Hue
            { "ColorChooser.hsvSaturation.textAndMnemonic", "Насыщеность" }, // Saturation
            { "ColorChooser.hsvValue.textAndMnemonic", "Значение" }, // Value
            { "ColorChooser.hsvTransparency.textAndMnemonic", "Прозрачность" }, // Transparency
//            { "ColorChooser.hsl.textAndMnemonic", "HS&L" }, // HS&L
            { "ColorChooser.hslHue.textAndMnemonic", "Оттенок" }, // Hue
            { "ColorChooser.hslSaturation.textAndMnemonic", "Насыщенность" }, // Saturation
            { "ColorChooser.hslLightness.textAndMnemonic", "Яркость" }, // Lightness
            { "ColorChooser.hslTransparency.textAndMnemonic", "Прозрачность" }, // Transparency
//            { "ColorChooser.rgb.textAndMnemonic", "R&GB" }, // R&GB
            { "ColorChooser.rgbRed.textAndMnemonic", "Красный (&D)" }, // Re&d
            { "ColorChooser.rgbGreen.textAndMnemonic", "Зелёный (&N)" }, // Gree&n
            { "ColorChooser.rgbBlue.textAndMnemonic", "Синий (&B)" }, // &Blue
            { "ColorChooser.rgbAlpha.textAndMnemonic", "Альфа" }, // Alpha
            { "ColorChooser.rgbHexCode.textAndMnemonic", "Цветовой код (&C)" }, // &Color Code
//            { "ColorChooser.cmyk.textAndMnemonic", "C&MYK" }, // C&MYK
            { "ColorChooser.cmykCyan.textAndMnemonic", "Голубой" }, // Cyan
            { "ColorChooser.cmykMagenta.textAndMnemonic", "Пурпурный" }, // Magenta
            { "ColorChooser.cmykYellow.textAndMnemonic", "Жёлтый" }, // Yellow
            { "ColorChooser.cmykBlack.textAndMnemonic", "Чёрный" }, // Black
            { "ColorChooser.cmykAlpha.textAndMnemonic", "Альфа" }, // Alpha

            // ############ OPTION PANE STRINGS #############
            // We only define mnemonics for YES/NO, but for completeness you can
            // define mnemonics for any of the buttons.
            { "OptionPane.yesButton.textAndMnemonic", "Да (&Y)" }, // &Yes
            { "OptionPane.noButton.textAndMnemonic", "Нет (&N)" }, // &No
//            { "OptionPane.okButton.textAndMnemonic", "OK" }, // OK
            { "OptionPane.cancelButton.textAndMnemonic", "Отмена" }, // Cancel
            { "OptionPane.title.textAndMnemonic", "Выберите вариант" }, // Select an Option
            // Title for the dialog for the showInputDialog methods. Only used
            // if the developer uses one of the variants that doesn't take a
            // title.
            { "OptionPane.inputDialog.titleAndMnemonic", "Ввод" }, // Input
            // Title for the dialog for the showMessageDialog methods. Only used
            // if the developer uses one of the variants that doesn't take a
            // title.
            { "OptionPane.messageDialog.titleAndMnemonic", "Сообщение" }, // Message

            // ############ Printing Dialog Strings ############
            { "PrintingDialog.titleProgress.textAndMnemonic", "Печать" }, // Printing
            { "PrintingDialog.titleAborting.textAndMnemonic", "Печать (прерывание)" }, // Printing (Aborting)
            { "PrintingDialog.contentInitial.textAndMnemonic", "Идет печать..." }, // Printing in progress...

            // The following string will be formatted by a MessageFormat
            // and {0} will be replaced by page number being printed
            { "PrintingDialog.contentProgress.textAndMnemonic", "Печатается страница {0}..." }, // Printed page {0}...

            { "PrintingDialog.contentAborting.textAndMnemonic", "Прерывание печати..." }, // Printing aborting...

            { "PrintingDialog.abortButton.textAndMnemonic", "Прервать (&A)" }, // &Abort
            { "PrintingDialog.abortButtonToolTip.textAndMnemonic", "Прервать печать" }, // Abort Printing

            // ############ Internal Frame Strings ############
            { "InternalFrame.iconButtonToolTip", "Свернуть" }, // Minimize
            { "InternalFrame.maxButtonToolTip", "Развернуть" }, // Maximize
            { "InternalFrame.restoreButtonToolTip", "Восстановить" }, // Restore
            { "InternalFrame.closeButtonToolTip", "Закрыть" }, // Close

            // ############ Internal Frame Title Pane Strings ############
            { "InternalFrameTitlePane.restoreButton.textAndMnemonic", "Восстановить (&R)" }, // &Restore
            { "InternalFrameTitlePane.moveButton.textAndMnemonic", "Переместить (&M)" }, // &Move
            { "InternalFrameTitlePane.sizeButton.textAndMnemonic", "Размер (&S)" }, // &Size
            { "InternalFrameTitlePane.minimizeButton.textAndMnemonic", "Свернуть (&N)" }, // Mi&nimize
            { "InternalFrameTitlePane.maximizeButton.textAndMnemonic", "Развернуть (&X)" }, // Ma&ximize
            { "InternalFrameTitlePane.closeButton.textAndMnemonic", "Закрыть (&C)" }, // &Close

            // ############ Text strings #############
            // Used for html forms
            { "FormView.submitButton.textAndMnemonic", "Отправить" }, // Submit Query
            { "FormView.resetButton.textAndMnemonic", "Сброс" }, // Reset
            { "FormView.browseFileButton.textAndMnemonic", "Выбрать..." }, // Browse...

            // ############ Abstract Document Strings ############
            { "AbstractDocument.styleChange.textAndMnemonic", "смену стиля" }, // style change
            { "AbstractDocument.addition.textAndMnemonic", "добавление" }, // addition
            { "AbstractDocument.deletion.textAndMnemonic", "удаление" }, // deletion
            { "AbstractDocument.undo.textAndMnemonic", "Отменить" }, // Undo
            { "AbstractDocument.redo.textAndMnemonic", "Повторить" }, // Redo

            // ############ Abstract Button Strings ############
//            { "AbstractButton.click.textAndMnemonic", "click" }, // click

            // ############ Abstract Undoable Edit Strings ############
            { "AbstractUndoableEdit.undo.textAndMnemonic", "Отменить" }, // Undo
            { "AbstractUndoableEdit.redo.textAndMnemonic", "Повторить" }, // Redo

            // ############ Combo Box Strings ############
//            { "ComboBox.togglePopup.textAndMnemonic", "togglePopup" }, // togglePopup

            // ############ Progress Monitor Strings ############
            { "ProgressMonitor.progress.textAndMnemonic", "Процесс..." }, // Progress...

            // ############ Split Pane Strings ############
            { "SplitPane.leftButton.textAndMnemonic", "левая кнопка" }, // left button
            { "SplitPane.rightButton.textAndMnemonic", "правая кнопка" }, // right button
            // Used for Isindex
            { "IsindexView.prompt", "По этому индексу возможен поиск.  Введите строку для поиска:" }, // This is a searchable index.  Enter search keywords:

            // ############ InternalFrameTitlePane Strings ############
            { "InternalFrameTitlePane.iconifyButtonAccessibleName", "Свернуть" }, // Iconify
            { "InternalFrameTitlePane.maximizeButtonAccessibleName", "Развернуть" }, // Maximize
            { "InternalFrameTitlePane.closeButtonAccessibleName", "Закрыть" }, // Close
        };
    }
}
