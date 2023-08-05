import java.time.DayOfWeek;
import java.time.LocalDate;

class Meetup {
    private final int month;
    private final int year;

    public Meetup(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public LocalDate day(DayOfWeek dayOfWeek, MeetupSchedule meetupSchedule) {
        LocalDate localDate = LocalDate.of(year, month, 1);

        if (meetupSchedule == MeetupSchedule.TEENTH) {
            localDate = iterateDays(localDate.plusDays(12), dayOfWeek);

        } else if (meetupSchedule == MeetupSchedule.FIRST) {
            localDate = iterateDays(localDate, dayOfWeek);

        } else if (meetupSchedule == MeetupSchedule.SECOND) {
            localDate = iterateDays(localDate.plusDays(7), dayOfWeek);

        } else if (meetupSchedule == MeetupSchedule.THIRD) {
            localDate = iterateDays(localDate.plusDays(14), dayOfWeek);

        } else if (meetupSchedule == MeetupSchedule.FOURTH) {
            localDate = iterateDays(localDate.plusDays(21), dayOfWeek);

        } else if (meetupSchedule == MeetupSchedule.LAST) {
            int daysInMonth = localDate.lengthOfMonth();
            localDate = localDate.withDayOfMonth(daysInMonth);

            while (localDate.getDayOfWeek() != dayOfWeek) {
                localDate = localDate.minusDays(1);
            }
        }
        return localDate;
    }

    private LocalDate iterateDays(LocalDate localDate, DayOfWeek dayOfWeek) {
        while (localDate.getDayOfWeek() != dayOfWeek) {
            localDate = localDate.plusDays(1);
        }
        return localDate;
    }
}
