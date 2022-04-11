package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setdate (String day, String month, String year ) {
        $("#dateOfBirthInput").click(); // календарь
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1900");
        $("[aria-label$='December 7th, 1900']").click();

    }
}
