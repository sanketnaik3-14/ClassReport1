package com.example.sanket.classreport;

/**
 * Created by sanket on 06/02/17.
 */

public class ReportCard {

    private int mStudentId, mSemOneAttendance, mSemTwoAttendance;
    private float mFinalAttendancePercentage;
    private String mSub1, mSub2, mSub3, mSub4, mSub5, mSub6, mComments, mFinals;
    private short mSemester1;
    private byte mSemester2;

    private static final int PERCENT_CALCULATE = 100;
    private static final int TOTAL_ATTENDANCE = 80;

    public ReportCard(int studentId) {
        mStudentId = studentId;
    }

    public ReportCard(int semOneAttendance, int semTwoAttendance) {
        mSemOneAttendance = semOneAttendance;
        mSemTwoAttendance = semTwoAttendance;
    }

    public ReportCard(short semester1, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6) {
        mSemester1 = semester1;
        mSub1 = sub1;
        mSub2 = sub2;
        mSub3 = sub3;
        mSub4 = sub4;
        mSub5 = sub5;
        mSub6 = sub6;
    }

    public ReportCard(byte semester2, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6) {
        mSemester2 = semester2;
        mSub1 = sub1;
        mSub2 = sub2;
        mSub3 = sub3;
        mSub4 = sub4;
        mSub5 = sub5;
        mSub6 = sub6;
    }

    public ReportCard(String finals, String sub1, String sub2, String sub3, String sub4, String sub5, String sub6) {
        mFinals = finals;
        mSub1 = sub1;
        mSub2 = sub2;
        mSub3 = sub3;
        mSub4 = sub4;
        mSub5 = sub5;
        mSub6 = sub6;
    }

    public float getAttendancePercentage() {
        int avg = (mSemOneAttendance + mSemTwoAttendance) / 2;
        mFinalAttendancePercentage = ((avg * PERCENT_CALCULATE) / TOTAL_ATTENDANCE);
        return mFinalAttendancePercentage;
    }

    public void setComment(String comment) {
        mComments = comment;
    }

    public String getComment() {
        return mComments;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentId=" + mStudentId +
                ", mSemOneAttendance=" + mSemOneAttendance +
                ", mSemTwoAttendance=" + mSemTwoAttendance +
                ", mFinalAttendancePercentage=" + mFinalAttendancePercentage +
                ", mSub1='" + mSub1 + '\'' +
                ", mSub2='" + mSub2 + '\'' +
                ", mSub3='" + mSub3 + '\'' +
                ", mSub4='" + mSub4 + '\'' +
                ", mSub5='" + mSub5 + '\'' +
                ", mSub6='" + mSub6 + '\'' +
                ", mComments='" + mComments + '\'' +
                ", mFinals='"   + mFinals + '\'' +
                ", mSemester1=" + mSemester1 +
                ", mSemester2=" + mSemester2 +
                '}';
    }
}
