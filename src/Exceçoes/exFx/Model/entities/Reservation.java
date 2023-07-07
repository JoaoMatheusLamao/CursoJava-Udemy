package Exceçoes.exFx.Model.entities;

import Exceçoes.exFx.Model.excepitions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer room_number;
    private Date check_in;
    private Date check_out;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer room_number, Date check_in, Date chec_out) {
        this.room_number = room_number;
        this.check_in = check_in;
        this.check_out = chec_out;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public Date getCheck_in() {
        return check_in;
    }

    public Date getCheck_out() {
        return check_out;
    }

    public long duration(){
        long diferenca = check_out.getTime() - check_in.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MICROSECONDS);
    }

    public void updateDates(Date check_in, Date check_out) throws DomainException{
        Date now = new Date();
        if (check_in.before(now) || check_out.before(now)){
            throw new DomainException("Datas inválidas");
        }

        if (!check_out.after(check_in)) {
            throw new DomainException("Datas inválidas - check-out precisa ser depois do check-in");
        }
        this.check_in = check_in;
        this.check_out = check_out;
    }

    @Override
    public String toString() {
        return "Room "
                + room_number
                + ", check-in: "
                + sdf.format(check_in)
                + ", check-out: "
                + sdf.format(check_out)
                + ", duration: "
                + duration()
                + "nights";
    }
}
