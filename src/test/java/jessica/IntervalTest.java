package jessica;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Date;
import java.sql.Time;

//Write a class Interval<T> that represents a mathematical interval on a linearly ordered set (e.g. all numbers between 3 and 7, all dates from 11.1.2000 to 3.5.2001, all words between "apple" and "pear",...). The data type of the elements is flexible, as you can see in the examples. The class should contain the following method:
//- public Interval(T lowerBound, T upperBound) Constructor
//- public boolean isEmpty()
//- public boolean contains(T value)
//checks if value is contained in the interval, i.e. if value is greater than the lower limit of the interval and less than the upper limit.
//- public <T1> interval<T> intersection(interval<T1> other) forms an intersection interval of this and other.
//Think well about the bounds for T and T1 so that the following task is solvable! Write a small main program in which you:
//- create an interval of strings and call all three methods at least once for it.
//- create an interval of java.util.Date and make the intersection with a second inter- vall of java.util.Date and then make the intersection with an interval of java.sql.Time.
//(The purpose of this task is to create intersections between objects of different classes. So please don't switch to the much newer and much more awesome LocalDate and LocalTime classes here. I believe you can handle them).
//A formal test is not necessary.

class IntervalTest {

    // <String>
    //   <isEmpty>
    @Test
    void isEmptyBeingTrueWithString() {
        // Given that lower bound is alphabetically greater than upper bound
        String lowerBound = "z";
        String upperBound = "a";

        // And an interval
        Interval<String> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return true
        assertThat(generic.isEmpty(), is(true));
    }

    @Test
    void isEmptyBeingFalseWithString() {
        // Given that lower bound is alphabetically lower than upper bound 😜
        String lowerBound = "a";
        String upperBound = "z";

        // And an interval
        Interval<String> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return false
        assertThat(generic.isEmpty(), is(false));
    }
    //   </isEmpty>
    //   <contains>
    @Test
    void containsBeingTrueWithString() {
        // Given a valid range of strings
        String lowerBound = "a";
        String upperBound = "k";

        // And an interval
        Interval<String> generic = new Interval<>(lowerBound, upperBound);

        // Then contains() should return true
        assertThat(generic.contains("j"), is(true));
    }

    @Test
    void containsBeingFalseWithString() {
        // Given a valid range of strings
        String lowerBound = "a";
        String upperBound = "b";

        // And an interval
        Interval<String> generic = new Interval<>(lowerBound, upperBound);

        // Then contains() with a value outside of the given interval should return false
        assertThat(generic.contains("c"), is(false));
    }
    //   </contains>
    // </String>


    // <Date>
    @Test
    void isEmptyBeingTrueWithDate() {
        // Given that lower bound is greater than upper bound
        Date lowerBound = new Date(1997, 4, 21);
        Date upperBound = new Date(1988, 2, 25);

        // And an interval
        Interval<Date> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return true
        assertThat(generic.isEmpty(), is(true));
    }

    @Test
    void isEmptyBeingFalseWithDate() {
        // Given that lower bound is lower than upper bound 😜
        Date lowerBound = new Date(1997, 4, 21);
        Date upperBound = new Date(2021, 5, 16);

        // And an interval
        Interval<Date> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return false
        assertThat(generic.isEmpty(), is(false));
    }
     //</Date>

    // <Date>
    //   <isEmpty>

    @Test
    void isEmptyBeingTrueWithTime() {
        // Given that lower bound is greater than upper bound
        Time lowerBound = new Time(1997, 4, 21);
        Time upperBound = new Time(1988, 2, 25);

        // And an interval
        Interval<Time> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return true
        assertThat(generic.isEmpty(), is(true));
    }

    @Test
    void isEmptyBeingFalseWithTime() {
        // Given that lower bound is lower than upper bound 😜
        Time lowerBound = new Time(1997, 4, 21);
        Time upperBound = new Time(2021, 5, 16);

        // And an interval
        Interval<Time> generic = new Interval<>(lowerBound, upperBound);

        // Then isEmpty() should return false
        assertThat(generic.isEmpty(), is(false));
    }
    //   </isEmpty>
    //   <contains>
    @Test
    void containsBeingTrueWithDate() {
        // Given a valid range of dates
        Date lowerBound = new Date(1997, 4, 21);
        Date upperBound = new Date(2021, 5, 16);

        // And an interval
        Interval<Date> generic = new Interval<>(lowerBound, upperBound);

        // Then contains() should return true
        assertThat(generic.contains(new Date(2000, 1, 1)), is(true));
    }

    @Test
    void containsBeingFalseWithDate() {
        // Given a valid range of strings
        Date lowerBound = new Date(1997, 4, 21);
        Date upperBound = new Date(2021, 5, 16);

        // And an interval
        Interval<Date> generic = new Interval<>(lowerBound, upperBound);

        // Then contains() with a value outside of the given interval should return false
        assertThat(generic.contains(new Date(3000, 1, 1)), is(false));
    }
    //   </contains>
    //</Time>



}