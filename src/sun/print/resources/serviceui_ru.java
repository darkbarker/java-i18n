/* This file is encoded as UTF-8 */

package sun.print.resources;

import java.util.ListResourceBundle;

/**
 * <p>Resource bundle for AWT with "ru" locale.</p>
 * <p>
 * Composed using "serviceui.properties" file from "sun.print.resources" package
 * of OpenJDK 8 as prototype.</p>
 * 
 * @author darkbarker ( https://github.com/darkbarker )
 * @author Sergey Ushakov ( https://github.com/s-n-ushakov , s-n-ushakov@yandex.ru )
 */
public final class serviceui_ru extends ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "border.chromaticity", "Цветность" }, // Color Appearance
            { "border.copies", "Копии" }, // Copies
            { "border.jobattributes", "Атрибуты задания" }, // Job Attributes
            { "border.media", "Медиа" }, // Media
            { "border.orientation", "Ориентация" }, // Orientation
            { "border.printrange", "Диапазон печати" }, // Print Range
            { "border.printservice", "Сервис печати" }, // Print Service
            { "border.quality", "Качество" }, // Quality
            { "border.sides", "Страницы" }, // Sides
            { "border.margins", "Поля" }, // Margins

            { "button.cancel", "Отмена" }, // Cancel
//            { "button.ok", "OK" }, // OK
            { "button.print", "Печать" }, // Print
            { "button.properties", "Свойства... (&R)" }, // P&roperties...

            { "checkbox.collate", "Сортировка (&C)" }, // &Collate
            { "checkbox.jobsheets", "Баннер (&B)" }, // &Banner Page
            { "checkbox.printtofile", "Печать в файл (&F)" }, // Print To &File

            { "dialog.printtitle", "Печать" }, // Print
            { "dialog.pstitle", "Настройки страницы" }, // Page Setup
            { "dialog.overwrite", "Этот файл уже существует. Перезаписать существующий файл?" }, // This file already exists.  Would you like to overwrite the existing file?
            { "dialog.owtitle", "Печать в файл" }, // Print To File
            { "dialog.printtofile", "Печать в файл" }, // Print To File
            { "dialog.noprintermsg", "Отсутствуют сервисы печати." }, // No print service found.
            { "dialog.writeerror", "Невозможно записать в файл:" }, // Cannot write to file:

            { "label.info", "Информация:" }, // Info:
            { "label.jobname", "Имя задания (&J):" }, // &Job Name:
            { "label.numcopies", "Количество копий (&O):" }, // Number &of copies:
            { "label.priority", "Приоритет (&R):" }, // P&riority:
            { "label.psname", "Имя (&N):" }, // &Name:
            { "label.pstype", "Тип:" }, // Type:
            { "label.rangeto", "до" }, // To
            { "label.size", "Размер (&Z):" }, // Si&ze:
            { "label.source", "Источник (&C):" }, // Sour&ce:
            { "label.status", "Статус:" }, // Status:
            { "label.username", "Имя пользователя (&U):" }, // &User Name:
            { "label.millimetres", "(мм)" }, // (mm)
            { "label.inches", "(дюйм)" }, // (in)
            { "label.topmargin", "верх (&T)" }, // &top
            { "label.bottommargin", "низ (&b)" }, // &bottom
            { "label.leftmargin", "лево (&F)" }, // le&ft
            { "label.rightmargin", "право (&R)" }, // &right

            { "radiobutton.color", "Цвет (&C)" }, // &Color
            { "radiobutton.draftq", "Черновик (&F)" }, // Dra&ft
            { "radiobutton.duplex", "Двойной (&D)" }, // &Duplex
            { "radiobutton.highq", "Высокое (&H)" }, // &High
            { "radiobutton.landscape", "Альбомная (&L)" }, // &Landscape
            { "radiobutton.monochrome", "Монохромный (&M)" }, // &Monochrome
            { "radiobutton.normalq", "Нормальное (&N)" }, // &Normal
            { "radiobutton.oneside", "Одна сторона (&O)" }, // &One Side
            { "radiobutton.portrait", "Портретная (&P)" }, // &Portrait
            { "radiobutton.rangeall", "Все (&L)" }, // A&ll
            { "radiobutton.rangepages", "Страницы (&E)" }, // Pag&es
            { "radiobutton.revlandscape", "Обратная альбомная (&n)" }, // Reverse La&ndscape
            { "radiobutton.revportrait", "Обратная портретная (&I)" }, // Reverse Portra&it
            { "radiobutton.tumble", "Календарь (&T)" }, // &Tumble
            // The vkMnemonics correspond with the constants defined in KeyEvent, eg
            // 65 = KeyEvent.VK_A
            { "tab.appearance", "Вид (&A)" }, // &Appearance
            { "tab.general", "Общие (&G)" }, // &General
            { "tab.pagesetup", "Настройки страницы (&S)" }, // Page &Setup

            { "error.pagerange", "Неверный диапазон страниц; введите ещё раз (например 1-3,5,7-10)" }, // Invalid page range; please re-enter values (e.g. 1-3,5,7-10)
            { "error.destination", "Неверное имя файла, попробуйте еще раз" }, // Invalid filename; please try again

            // The following keys match the Strings returned by MediaSizeName.toString()
            // (in some cases the space character is replaced by '-' and the pound 
            // character is replaced with 'n')

//            { "iso-4a0", "4A0 (ISO/DIN & JIS)" }, // 4A0 (ISO/DIN & JIS)
//            { "iso-2a0", "2A0 (ISO/DIN & JIS)" }, // 2A0 (ISO/DIN & JIS)
//            { "iso-a0", "A0 (ISO/DIN & JIS)" }, // A0 (ISO/DIN & JIS)
//            { "iso-a1", "A1 (ISO/DIN & JIS)" }, // A1 (ISO/DIN & JIS)
//            { "iso-a2", "A2 (ISO/DIN & JIS)" }, // A2 (ISO/DIN & JIS)
//            { "iso-a3", "A3 (ISO/DIN & JIS)" }, // A3 (ISO/DIN & JIS)
//            { "iso-a4", "A4 (ISO/DIN & JIS)" }, // A4 (ISO/DIN & JIS)
//            { "iso-a5", "A5 (ISO/DIN & JIS)" }, // A5 (ISO/DIN & JIS)
//            { "iso-a6", "A6 (ISO/DIN & JIS)" }, // A6 (ISO/DIN & JIS)
//            { "iso-a7", "A7 (ISO/DIN & JIS)" }, // A7 (ISO/DIN & JIS)
//            { "iso-a8", "A8 (ISO/DIN & JIS)" }, // A8 (ISO/DIN & JIS)
//            { "iso-a9", "A9 (ISO/DIN & JIS)" }, // A9 (ISO/DIN & JIS)
//            { "iso-a10", "A10 (ISO/DIN & JIS)" }, // A10 (ISO/DIN & JIS)
//            { "iso-b0", "B0 (ISO/DIN)" }, // B0 (ISO/DIN)
//            { "iso-b1", "B1 (ISO/DIN)" }, // B1 (ISO/DIN)
//            { "iso-b2", "B2 (ISO/DIN)" }, // B2 (ISO/DIN)
//            { "iso-b3", "B3 (ISO/DIN)" }, // B3 (ISO/DIN)
//            { "iso-b4", "B4 (ISO/DIN)" }, // B4 (ISO/DIN)
//            { "iso-b5", "B5 (ISO/DIN)" }, // B5 (ISO/DIN)
//            { "iso-b6", "B6 (ISO/DIN)" }, // B6 (ISO/DIN)
//            { "iso-b7", "B7 (ISO/DIN)" }, // B7 (ISO/DIN)
//            { "iso-b8", "B8 (ISO/DIN)" }, // B8 (ISO/DIN)
//            { "iso-b9", "B9 (ISO/DIN)" }, // B9 (ISO/DIN)
//            { "iso-b10", "B10 (ISO/DIN)" }, // B10 (ISO/DIN)
//            { "jis-b0", "B0 (JIS)" }, // B0 (JIS)
//            { "jis-b1", "B1 (JIS)" }, // B1 (JIS)
//            { "jis-b2", "B2 (JIS)" }, // B2 (JIS)
//            { "jis-b3", "B3 (JIS)" }, // B3 (JIS)
//            { "jis-b4", "B4 (JIS)" }, // B4 (JIS)
//            { "jis-b5", "B5 (JIS)" }, // B5 (JIS)
//            { "jis-b6", "B6 (JIS)" }, // B6 (JIS)
//            { "jis-b7", "B7 (JIS)" }, // B7 (JIS)
//            { "jis-b8", "B8 (JIS)" }, // B8 (JIS)
//            { "jis-b9", "B9 (JIS)" }, // B9 (JIS)
//            { "jis-b10", "B10 (JIS)" }, // B10 (JIS)
//            { "iso-c0", "C0 (ISO/DIN)" }, // C0 (ISO/DIN)
//            { "iso-c1", "C1 (ISO/DIN)" }, // C1 (ISO/DIN)
//            { "iso-c2", "C2 (ISO/DIN)" }, // C2 (ISO/DIN)
//            { "iso-c3", "C3 (ISO/DIN)" }, // C3 (ISO/DIN)
//            { "iso-c4", "C4 (ISO/DIN)" }, // C4 (ISO/DIN)
//            { "iso-c5", "C5 (ISO/DIN)" }, // C5 (ISO/DIN)
//            { "iso-c6", "C6 (ISO/DIN)" }, // C6 (ISO/DIN)
//            { "iso-c7", "C7 (ISO/DIN)" }, // C7 (ISO/DIN)
//            { "iso-c8", "C8 (ISO/DIN)" }, // C8 (ISO/DIN)
//            { "iso-c9", "C9 (ISO/DIN)" }, // C9 (ISO/DIN)
//            { "iso-c10", "C10 (ISO/DIN)" }, // C10 (ISO/DIN)
//            { "na-letter", "Letter" }, // Letter
//            { "na-legal", "Legal" }, // Legal
//            { "executive", "Executive" }, // Executive
//            { "ledger", "Ledger" }, // Ledger
//            { "tabloid", "Tabloid" }, // Tabloid
//            { "invoice", "Invoice" }, // Invoice
//            { "folio", "Folio" }, // Folio
//            { "quarto", "Quarto" }, // Quarto
//            { "japanese-postcard", "Postcard (JIS)" }, // Postcard (JIS)
//            { "oufuko-postcard", "Double Postcard (JIS)" }, // Double Postcard (JIS)
//            { "a", "Engineering A" }, // Engineering A
//            { "b", "Engineering B" }, // Engineering B
//            { "c", "Engineering C" }, // Engineering C
//            { "d", "Engineering D" }, // Engineering D
//            { "e", "Engineering E" }, // Engineering E
//            { "iso-designated-long", "ISO Designated Long" }, // ISO Designated Long
//            { "italian-envelope", "Italy Envelope" }, // Italy Envelope
//            { "italy-envelope", "Italy Envelope" }, // Italy Envelope
//            { "invite-envelope", "Invitation Envelope" }, // Invitation Envelope
//            { "monarch-envelope", "Monarch Envelope" }, // Monarch Envelope
//            { "personal-envelope", "Personal Envelope" }, // Personal Envelope
//            { "na-number-9-envelope", "No. 9 Envelope" }, // No. 9 Envelope
//            { "na-number-10-envelope", "No. 10 Envelope" }, // No. 10 Envelope
//            { "na-number-11-envelope", "No. 11 Envelope" }, // No. 11 Envelope
//            { "na-number-12-envelope", "No. 12 Envelope" }, // No. 12 Envelope
//            { "na-number-14-envelope", "No. 14 Envelope" }, // No. 14 Envelope
//            { "na-6x9-envelope", "6x9 Envelope" }, // 6x9 Envelope
//            { "na-7x9-envelope", "6x7 Envelope" }, // 6x7 Envelope
//            { "na-9x11-envelope", "9x11 Envelope" }, // 9x11 Envelope
//            { "na-9x12-envelope", "9x12 Envelope" }, // 9x12 Envelope
//            { "na-10x13-envelope", "10x15 Envelope" }, // 10x15 Envelope
//            { "na-10x14-envelope", "10x15 Envelope" }, // 10x15 Envelope
//            { "na-10x15-envelope", "10x15 Envelope" }, // 10x15 Envelope
//            { "na-5x7", "5\" x 7\" Paper" }, // 5" x 7" Paper
//            { "na-8x10", "8\" x 10\" Paper" }, // 8" x 10" Paper

            // The following keys match the Strings returned by MediaTray.toString()

            { "auto-select", "Автоматический выбор" }, // Automatically Select
            { "top", "Верх" }, // Top
            { "middle", "Середина" }, // Middle
            { "bottom", "Низ" }, // Bottom
            { "envelope", "Покрытие" }, // Envelope
            { "manual", "Ручной" }, // Manual
            { "large-capacity", "Большая ёмкость" }, // Large Capacity
//            { "main", "Main" }, // Main
//            { "side", "Side" }, // Side
            // Add the additional standard bins defined by win32
//            { "Manual-Envelope", "Manual Envelope" }, // Manual Envelope
            { "Automatic-Feeder", "Автоматическая подача бумаги" }, // Automatic Feeder
            { "Tractor-Feeder", "Непрерывная подача бумаги" }, // Tractor Feeder
            { "Small-Format", "Малый формат" }, // Small Format
            { "Large-Format", "Большой формат" }, // Large Format
//            { "Cassette", "Cassette" }, // Cassette
//            { "Form-Source", "Form Source" }, // Form Source

            // The following keys match the Strings returned by 
            // PrinterIsAcceptingJobs.toString()

            { "accepting-jobs", "Принимает задания" }, // Accepting jobs
            { "not-accepting-jobs", "Не принимает задания" }, // Not accepting jobs
        };
    }
}
