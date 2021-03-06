package com.lenach.totalbooker.data;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by o.chubukina on 30/03/2017.
 */

@Entity
@Table(name = "tb_bookings")
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "booking_id")
    private long id;

    @Column(name = "room_id")
    private long room_id;

    @Column(name = "user_id")
    private long user_id;

    @Column(name = "start_time")
    private LocalDateTime bookingTimeStart;

    @Column(name = "duration")
    private Duration bookingDuration;


    public Booking() {
    }

    public Booking(long room_id, long user_id, LocalDateTime bookingTimeStart, Duration bookingDuration) {

        this.room_id = room_id;
        this.user_id = user_id;
        this.bookingTimeStart = bookingTimeStart;
        this.bookingDuration = bookingDuration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getBookingTimeStart() {
        return bookingTimeStart;
    }

    public void setBookingTimeStart(LocalDateTime bookingTimeStart) {
        this.bookingTimeStart = bookingTimeStart;
    }

    public Duration getBookingDuration() {
        return bookingDuration;
    }

    public void setBookingDuration(Duration bookingDuration) {
        this.bookingDuration = bookingDuration;
    }
}
