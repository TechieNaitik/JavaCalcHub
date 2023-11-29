import java.util.Date;
import java.time.LocalDate;
import java.awt.CardLayout;
import java.text.ParseException;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class AllCalc extends javax.swing.JFrame {

   CardLayout cl;

    public AllCalc() {

        initComponents();

        cl=(CardLayout)getContentPane().getLayout();

        setTitle("Calculators");

    }

    int fs=0,ms=0,ls=0; int fd,md,ld; int a,b,c;     //Quadratic Equations
    
    int cconvcmb1=0,cconvcmb2=0;     //Currency Conversion
    
    float amt=0.0f,splitamt=0.0f; int nppl=0;     //Split Bill
    
    float loanamt=0.0f,interest=0.0f,femi=0.0f; double emi=0.0d,ttlpym=0.0d; int fy=0,my=0;     //Loan Calculator
    
    float sgst_cgst=0.0f,gstamt=0.0f;     //GST Calculator
    
    float finalamt=0.0f; float currencyamt=0.0f; 
    
    ;int investmentcmb1=0,investmentcmb2=0; float invest=0.0f,r=0.0f;     //Investment Calculator
    
    int lengthconvcmb1=0,lengthconvcmb2=0; float length=0.0f; double finallength=0.0d;       //Length Conversion
    
    String startdate="",enddate=""; int sd,sm,sy,ed,em,ey;           //Date Difference
    
    String DOB="";                                                 //Age Calculator
    
    int sizeconvcmb1=0; int sizeconvcmb2=0; double size = 0.0d,finalsize=0.0d;    //Size Conversion
    
    int tempconvcmb1=0; int tempconvcmb2=0; double temp = 0.0d,finaltemp=0.0d;    //Temperature Conversion
    
    int massconvcmb1=0; int massconvcmb2=0; double mass = 0.0d,finalmass=0.0d;    // Mass Conversion
    
    int timeconvcmb1=0; int timeconvcmb2=0; double time=0.0d,finaltime=0.0d;        //Time Conversion
    
    int speedconvcmb1=0; int speedconvcmb2=0; double speed=0.0d,finalspeed=0.0d;        //Speed Conversion
    
    int areaconvcmb1=0; int areaconvcmb2=0; double area=0.0d,finalarea=0.0d;        //Area Conversion
    
    int volumeconvcmb1=0; int volumeconvcmb2=0; double volume=0.0d,finalvolume=0.0d;        //Volume Conversion

    int numsysconvcmb1=0; int numsysconvcmb2=0; double numsys=0.0d,finalnumsys=0.0d;
    
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {



        buttonGroup1 = new javax.swing.ButtonGroup();

        buttonGroup2 = new javax.swing.ButtonGroup();

        pnlHome = new javax.swing.JPanel();

        jLabel1 = new javax.swing.JLabel();

        sciCalcB = new javax.swing.JButton();

        bmiCalcB = new javax.swing.JButton();

        ageCalcB = new javax.swing.JButton();

        dateCalcB = new javax.swing.JButton();

        perCalcB = new javax.swing.JButton();

        disCalcB = new javax.swing.JButton();

        quadCalcB = new javax.swing.JButton();

        jButton7 = new javax.swing.JButton();

        investCalcB = new javax.swing.JButton();

        currencyConvCalcB = new javax.swing.JButton();

        loanCalcB = new javax.swing.JButton();

        splitBillCalcB = new javax.swing.JButton();

        jButton12 = new javax.swing.JButton();

        jButton13 = new javax.swing.JButton();

        lengthConvCalcB = new javax.swing.JButton();

        areaConvCalcB = new javax.swing.JButton();

        volConvCalcB = new javax.swing.JButton();

        timeConvCalcB = new javax.swing.JButton();

        spdConvCalcB = new javax.swing.JButton();

        massConvCalcB = new javax.swing.JButton();

        tempConvCalcB = new javax.swing.JButton();

        storageSizeConvCalcB = new javax.swing.JButton();

        numSysConvCalcB = new javax.swing.JButton();

        HomeExitB = new javax.swing.JButton();

        GSTCalcB = new javax.swing.JButton();

        pnlSciCalc = new javax.swing.JPanel();

        jLabel2 = new javax.swing.JLabel();

        SciCalcBackB = new javax.swing.JButton();

        pnlBMICalc = new javax.swing.JPanel();

        jLabel3 = new javax.swing.JLabel();

        BMICalcBackB = new javax.swing.JButton();

        pnlDateDiffCalc = new javax.swing.JPanel();

        jLabel4 = new javax.swing.JLabel();

        DateDiffBackB = new javax.swing.JButton();

        jLabel43 = new javax.swing.JLabel();

        jLabel44 = new javax.swing.JLabel();

        startdatel1 = new javax.swing.JTextField();

        enddatel2 = new javax.swing.JTextField();

        datedDiffCalcB = new javax.swing.JButton();

        pnlAgeCalc = new javax.swing.JPanel();

        jLabel5 = new javax.swing.JLabel();

        AgeCalcBackB = new javax.swing.JButton();

        jLabel45 = new javax.swing.JLabel();

        DOBl1 = new javax.swing.JTextField();

        ageCalcButton = new javax.swing.JButton();

        pnlPercentageCalc = new javax.swing.JPanel();

        jLabel6 = new javax.swing.JLabel();

        PerCalcBackB = new javax.swing.JButton();

        pnlDiscountCalc = new javax.swing.JPanel();

        jLabel7 = new javax.swing.JLabel();

        DisCalcBackB = new javax.swing.JButton();

        pnlQuadEqnsCalc = new javax.swing.JPanel();

        jLabel8 = new javax.swing.JLabel();

        QuadEqnBackB = new javax.swing.JButton();

        jLabel23 = new javax.swing.JLabel();

        jButton1 = new javax.swing.JButton();

        quadEqncmb1 = new javax.swing.JComboBox<>();

        quadEqnscmb2 = new javax.swing.JComboBox<>();

        jButton2 = new javax.swing.JButton();

        quadEqnscmb3 = new javax.swing.JComboBox<>();

        jButton3 = new javax.swing.JButton();

        jScrollPane1 = new javax.swing.JScrollPane();

        jTextArea1 = new javax.swing.JTextArea();

        jScrollPane2 = new javax.swing.JScrollPane();

        dta1 = new javax.swing.JTextArea();

        dt1 = new javax.swing.JTextField();

        dt2 = new javax.swing.JTextField();

        dt3 = new javax.swing.JTextField();

        QuadEqnShowB = new javax.swing.JButton();

        pnlLengthConvCalc = new javax.swing.JPanel();

        jLabel9 = new javax.swing.JLabel();

        LengthConvCalcBackB = new javax.swing.JButton();

        jLabel39 = new javax.swing.JLabel();

        jLabel41 = new javax.swing.JLabel();

        lengthConvCalcT1 = new javax.swing.JTextField();

        lengthConvCMB1 = new javax.swing.JComboBox<>();

        lengthConvCMB2 = new javax.swing.JComboBox<>();

        jLabel42 = new javax.swing.JLabel();

        lengthConvCalcCalcB = new javax.swing.JButton();

        pnlAreaConvCalc = new javax.swing.JPanel();

        jLabel10 = new javax.swing.JLabel();

        AreaConvCalcBackB = new javax.swing.JButton();

        jLabel52 = new javax.swing.JLabel();

        areaConvCalcT1 = new javax.swing.JTextField();

        jLabel53 = new javax.swing.JLabel();

        areaConvCMB1 = new javax.swing.JComboBox<>();

        jLabel54 = new javax.swing.JLabel();

        areaConvCMB2 = new javax.swing.JComboBox<>();

        areaConvCalc = new javax.swing.JButton();

        pnlVolumeConvCalc = new javax.swing.JPanel();

        jLabel11 = new javax.swing.JLabel();

        VolumeConvCalcBackB = new javax.swing.JButton();

        jLabel55 = new javax.swing.JLabel();

        volumeConvCalcT1 = new javax.swing.JTextField();

        jLabel56 = new javax.swing.JLabel();

        volumeConvCMB1 = new javax.swing.JComboBox<>();

        jLabel57 = new javax.swing.JLabel();

        volumeConvCMB2 = new javax.swing.JComboBox<>();

        volumeConvCalc = new javax.swing.JButton();

        pnlSpeedConvCalc = new javax.swing.JPanel();

        jLabel12 = new javax.swing.JLabel();

        SpeedConvCalcBackB = new javax.swing.JButton();

        jLabel58 = new javax.swing.JLabel();

        speedConvCalcT1 = new javax.swing.JTextField();

        jLabel59 = new javax.swing.JLabel();

        speedConvCMB1 = new javax.swing.JComboBox<>();

        jLabel60 = new javax.swing.JLabel();

        speedConvCMB2 = new javax.swing.JComboBox<>();

        speedConvCalc = new javax.swing.JButton();

        pnlTimeConvCalc = new javax.swing.JPanel();

        jLabel13 = new javax.swing.JLabel();

        TimeConvCalcBackB = new javax.swing.JButton();

        jLabel61 = new javax.swing.JLabel();

        timeConvCalcT1 = new javax.swing.JTextField();

        jLabel62 = new javax.swing.JLabel();

        timeConvCMB1 = new javax.swing.JComboBox<>();

        jLabel63 = new javax.swing.JLabel();

        timeConvCMB2 = new javax.swing.JComboBox<>();

        timeConvCalc = new javax.swing.JButton();

        pnlMassConvCalc = new javax.swing.JPanel();

        MassConvCalcBackB = new javax.swing.JButton();

        jLabel14 = new javax.swing.JLabel();

        jLabel64 = new javax.swing.JLabel();

        massConvCalcT1 = new javax.swing.JTextField();

        jLabel65 = new javax.swing.JLabel();

        massConvCMB1 = new javax.swing.JComboBox<>();

        jLabel66 = new javax.swing.JLabel();

        massConvCMB2 = new javax.swing.JComboBox<>();

        massConvCalc = new javax.swing.JButton();

        pnlNumSystemConvCalc = new javax.swing.JPanel();

        jLabel15 = new javax.swing.JLabel();

        NumSysConvCalcBackB = new javax.swing.JButton();

        jLabel67 = new javax.swing.JLabel();

        numSysConvT1 = new javax.swing.JTextField();

        jLabel68 = new javax.swing.JLabel();

        numSysConvCMB1 = new javax.swing.JComboBox<>();

        jLabel69 = new javax.swing.JLabel();

        numSysConvCMB2 = new javax.swing.JComboBox<>();

        numSysConvCalc = new javax.swing.JButton();

        pnlTemperatureConvCalc = new javax.swing.JPanel();

        jLabel16 = new javax.swing.JLabel();

        TempConvCalcBackB = new javax.swing.JButton();

        jLabel49 = new javax.swing.JLabel();

        jLabel50 = new javax.swing.JLabel();

        tempConvCMB1 = new javax.swing.JComboBox<>();

        jLabel51 = new javax.swing.JLabel();

        tempConvCMB2 = new javax.swing.JComboBox<>();

        tempConvT1 = new javax.swing.JTextField();

        tempConvCalc = new javax.swing.JButton();

        pnlStorageSizeConvCalc = new javax.swing.JPanel();

        jLabel17 = new javax.swing.JLabel();

        StorageSizeConvCalcBackB = new javax.swing.JButton();

        jLabel46 = new javax.swing.JLabel();

        sizeConvT1 = new javax.swing.JTextField();

        jLabel47 = new javax.swing.JLabel();

        sizeConvCMB1 = new javax.swing.JComboBox<>();

        jLabel48 = new javax.swing.JLabel();

        sizeConvCMB2 = new javax.swing.JComboBox<>();

        sizeConvCalcB = new javax.swing.JButton();

        pnlInvestmentCalc = new javax.swing.JPanel();

        InvestmentCalcBackB = new javax.swing.JButton();

        jLabel18 = new javax.swing.JLabel();

        jRadioButton1 = new javax.swing.JRadioButton();

        jRadioButton2 = new javax.swing.JRadioButton();

        investmentCalcCalcB = new javax.swing.JButton();

        jRadioButton3 = new javax.swing.JRadioButton();

        jRadioButton4 = new javax.swing.JRadioButton();

        jLabel36 = new javax.swing.JLabel();

        jLabel37 = new javax.swing.JLabel();

        jLabel38 = new javax.swing.JLabel();

        investmentCalcT1 = new javax.swing.JTextField();

        investmentCalcT2 = new javax.swing.JTextField();

        investmentCalcCMB1 = new javax.swing.JComboBox<>();

        investmentCalcCMB2 = new javax.swing.JComboBox<>();

        pnlCurrencyConvCalc = new javax.swing.JPanel();

        jLabel19 = new javax.swing.JLabel();

        CurrencyConvCalcBackB = new javax.swing.JButton();

        currencyConvCMB2 = new javax.swing.JComboBox<>();

        currencyConvCMB1 = new javax.swing.JComboBox<>();

        currencyConvL1 = new javax.swing.JTextField();

        currencyConvCalculateB = new javax.swing.JButton();

        jLabel26 = new javax.swing.JLabel();

        jLabel27 = new javax.swing.JLabel();

        jLabel28 = new javax.swing.JLabel();

        jLabel29 = new javax.swing.JLabel();

        jLabel40 = new javax.swing.JLabel();

        pnlSplitBillCalc = new javax.swing.JPanel();

        jLabel20 = new javax.swing.JLabel();

        SplitBillCalcBackB = new javax.swing.JButton();

        jLabel24 = new javax.swing.JLabel();

        amtSplitBillCalcT1 = new javax.swing.JTextField();

        pplSplitBillCalcT2 = new javax.swing.JTextField();

        splitamtSplitBillCalcT1 = new javax.swing.JTextField();

        jLabel25 = new javax.swing.JLabel();

        jLabel30 = new javax.swing.JLabel();

        splitBillCalcCalcB = new javax.swing.JButton();

        pnlLoanCalc = new javax.swing.JPanel();

        jLabel21 = new javax.swing.JLabel();

        LoanCalcBackB = new javax.swing.JButton();

        jLabel31 = new javax.swing.JLabel();

        jLabel32 = new javax.swing.JLabel();

        amtLoanCalcT1 = new javax.swing.JTextField();

        interestLoanCalcT2 = new javax.swing.JTextField();

        jLabel33 = new javax.swing.JLabel();

        monthLoanCalcCMB2 = new javax.swing.JComboBox<>();

        yearsLoanCalcCMB1 = new javax.swing.JComboBox<>();

        loanCalcCalcB = new javax.swing.JButton();

        pnlGSTCalc = new javax.swing.JPanel();

        jLabel22 = new javax.swing.JLabel();

        GSTCalcBackB = new javax.swing.JButton();

        jLabel34 = new javax.swing.JLabel();

        gstCalcT1 = new javax.swing.JTextField();

        jLabel35 = new javax.swing.JLabel();

        gstCalcR1 = new javax.swing.JRadioButton();

        gstCalcR2 = new javax.swing.JRadioButton();

        gstCalcR3 = new javax.swing.JRadioButton();

        gstCalcR4 = new javax.swing.JRadioButton();

        gstCalcR5 = new javax.swing.JRadioButton();

        gstCalcCalcB = new javax.swing.JButton();



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        getContentPane().setLayout(new java.awt.CardLayout());



        pnlHome.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                pnlHomeMouseEntered(evt);

            }

        });



        jLabel1.setBackground(new java.awt.Color(102, 51, 255));

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel1.setText("            CALCULATOR");

        jLabel1.setOpaque(true);



        sciCalcB.setText("SCIENTIFIC CALCULATOR");

        sciCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                sciCalcBActionPerformed(evt);

            }

        });



        bmiCalcB.setText("BMI");

        bmiCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                bmiCalcBActionPerformed(evt);

            }

        });



        ageCalcB.setText("AGE");

        ageCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                ageCalcBActionPerformed(evt);

            }

        });



        dateCalcB.setText("DATE Difference");

        dateCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                dateCalcBActionPerformed(evt);

            }

        });



        perCalcB.setText("PERCENTAGE");

        perCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                perCalcBActionPerformed(evt);

            }

        });



        disCalcB.setText("DISCOUNT");

        disCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                disCalcBActionPerformed(evt);

            }

        });



        quadCalcB.setText("QUADRATIC EQUATIONS");

        quadCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                quadCalcBActionPerformed(evt);

            }

        });



        jButton7.setText("MONEY PURPOSES");



        investCalcB.setText("INVESTMENT");

        investCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                investCalcBActionPerformed(evt);

            }

        });



        currencyConvCalcB.setText("CURRENCY");

        currencyConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                currencyConvCalcBActionPerformed(evt);

            }

        });



        loanCalcB.setText("LOAN");

        loanCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                loanCalcBActionPerformed(evt);

            }

        });



        splitBillCalcB.setText("SPLIT BILL");

        splitBillCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                splitBillCalcBActionPerformed(evt);

            }

        });



        jButton12.setText("CONVERSIONS CALCULATOR");



        jButton13.setText("CALCULATIONS CALCULATOR");



        lengthConvCalcB.setText("LENGTH");

        lengthConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                lengthConvCalcBActionPerformed(evt);

            }

        });



        areaConvCalcB.setText("AREA");

        areaConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                areaConvCalcBActionPerformed(evt);

            }

        });



        volConvCalcB.setText("VOLUME");

        volConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                volConvCalcBActionPerformed(evt);

            }

        });



        timeConvCalcB.setText("TIME");

        timeConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                timeConvCalcBActionPerformed(evt);

            }

        });



        spdConvCalcB.setText("SPEED");

        spdConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                spdConvCalcBActionPerformed(evt);

            }

        });



        massConvCalcB.setText("MASS");

        massConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                massConvCalcBActionPerformed(evt);

            }

        });



        tempConvCalcB.setText("TEMPERATURE");

        tempConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                tempConvCalcBActionPerformed(evt);

            }

        });



        storageSizeConvCalcB.setText("STORAGE SIZE");

        storageSizeConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                storageSizeConvCalcBActionPerformed(evt);

            }

        });



        numSysConvCalcB.setText("NUMERAL SYSTEM");

        numSysConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                numSysConvCalcBActionPerformed(evt);

            }

        });



        HomeExitB.setText("EXIT");

        HomeExitB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                HomeExitBActionPerformed(evt);

            }

        });



        GSTCalcB.setText("GST");

        GSTCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                GSTCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlHomeLayout = new javax.swing.GroupLayout(pnlHome);

        pnlHome.setLayout(pnlHomeLayout);

        pnlHomeLayout.setHorizontalGroup(

            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlHomeLayout.createSequentialGroup()

                .addGap(54, 54, 54)

                .addComponent(quadCalcB)

                .addGap(68, 68, 68)

                .addComponent(numSysConvCalcB)

                .addGap(18, 18, 18)

                .addComponent(tempConvCalcB)

                .addGap(18, 18, 18)

                .addComponent(storageSizeConvCalcB)

                .addGap(0, 0, Short.MAX_VALUE))

            .addGroup(pnlHomeLayout.createSequentialGroup()

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addComponent(bmiCalcB)

                        .addGap(18, 18, 18)

                        .addComponent(dateCalcB)

                        .addGap(18, 18, 18)

                        .addComponent(ageCalcB))

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addGap(33, 33, 33)

                        .addComponent(perCalcB)

                        .addGap(18, 18, 18)

                        .addComponent(disCalcB)))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addComponent(lengthConvCalcB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(spdConvCalcB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addComponent(timeConvCalcB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                    .addComponent(areaConvCalcB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

                .addGap(10, 10, 10)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addComponent(massConvCalcB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(147, 147, 147)

                        .addComponent(loanCalcB)

                        .addGap(55, 55, 55)

                        .addComponent(GSTCalcB))

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addComponent(volConvCalcB)

                        .addGap(62, 62, 62)

                        .addComponent(investCalcB)

                        .addGap(18, 18, 18)

                        .addComponent(currencyConvCalcB)

                        .addGap(18, 18, 18)

                        .addComponent(splitBillCalcB))))

            .addGroup(pnlHomeLayout.createSequentialGroup()

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addGap(43, 43, 43)

                        .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlHomeLayout.createSequentialGroup()

                                .addGap(272, 272, 272)

                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(pnlHomeLayout.createSequentialGroup()

                                .addComponent(jButton13)

                                .addGap(161, 161, 161)

                                .addComponent(jButton12))))

                    .addGroup(pnlHomeLayout.createSequentialGroup()

                        .addGap(372, 372, 372)

                        .addComponent(sciCalcB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()

                        .addComponent(jButton7)

                        .addGap(89, 89, 89))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHomeLayout.createSequentialGroup()

                        .addComponent(HomeExitB)

                        .addContainerGap())))

        );

        pnlHomeLayout.setVerticalGroup(

            pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlHomeLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(64, 64, 64)

                .addComponent(sciCalcB)

                .addGap(110, 110, 110)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jButton7)

                    .addComponent(jButton12)

                    .addComponent(jButton13))

                .addGap(31, 31, 31)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(bmiCalcB)

                    .addComponent(dateCalcB)

                    .addComponent(investCalcB)

                    .addComponent(currencyConvCalcB)

                    .addComponent(splitBillCalcB)

                    .addComponent(lengthConvCalcB)

                    .addComponent(areaConvCalcB)

                    .addComponent(volConvCalcB)

                    .addComponent(ageCalcB))

                .addGap(18, 18, 18)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(perCalcB)

                    .addComponent(disCalcB)

                    .addComponent(loanCalcB)

                    .addComponent(timeConvCalcB)

                    .addComponent(spdConvCalcB)

                    .addComponent(massConvCalcB)

                    .addComponent(GSTCalcB))

                .addGap(18, 18, 18)

                .addGroup(pnlHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(quadCalcB)

                    .addComponent(tempConvCalcB)

                    .addComponent(storageSizeConvCalcB)

                    .addComponent(numSysConvCalcB))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)

                .addComponent(HomeExitB)

                .addContainerGap())

        );



        getContentPane().add(pnlHome, "cardHome");

        pnlHome.getAccessibleContext().setAccessibleName("");



        pnlSciCalc.setName(""); // NOI18N



        jLabel2.setBackground(new java.awt.Color(102, 51, 255));

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel2.setText("SCIENTIFIC CALCULATOR");

        jLabel2.setOpaque(true);



        SciCalcBackB.setText("BACK");

        SciCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                SciCalcBackBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlSciCalcLayout = new javax.swing.GroupLayout(pnlSciCalc);

        pnlSciCalc.setLayout(pnlSciCalcLayout);

        pnlSciCalcLayout.setHorizontalGroup(

            pnlSciCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSciCalcLayout.createSequentialGroup()

                .addGap(352, 352, 352)

                .addComponent(jLabel2)

                .addContainerGap(347, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSciCalcLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addComponent(SciCalcBackB)

                .addContainerGap())

        );

        pnlSciCalcLayout.setVerticalGroup(

            pnlSciCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSciCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)

                .addComponent(SciCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlSciCalc, "cardSciCalc");

        pnlSciCalc.getAccessibleContext().setAccessibleName("");



        jLabel3.setBackground(new java.awt.Color(102, 51, 255));

        jLabel3.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel3.setText("BMI CALCULATOR");

        jLabel3.setOpaque(true);



        BMICalcBackB.setText("BACK");

        BMICalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                BMICalcBackBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlBMICalcLayout = new javax.swing.GroupLayout(pnlBMICalc);

        pnlBMICalc.setLayout(pnlBMICalcLayout);

        pnlBMICalcLayout.setHorizontalGroup(

            pnlBMICalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlBMICalcLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addComponent(BMICalcBackB)

                .addContainerGap())

            .addGroup(pnlBMICalcLayout.createSequentialGroup()

                .addGap(372, 372, 372)

                .addComponent(jLabel3)

                .addContainerGap(395, Short.MAX_VALUE))

        );

        pnlBMICalcLayout.setVerticalGroup(

            pnlBMICalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlBMICalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)

                .addComponent(BMICalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlBMICalc, "cardBMICalc");



        jLabel4.setBackground(new java.awt.Color(102, 51, 255));

        jLabel4.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel4.setText("DATE DIFFERENCE CALCULATOR");

        jLabel4.setOpaque(true);



        DateDiffBackB.setText("BACK");

        DateDiffBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                DateDiffBackBActionPerformed(evt);

            }

        });



        jLabel43.setText("Start Date: ");



        jLabel44.setText("End Date: ");



        startdatel1.setText("DD-MM-YYYY");



        enddatel2.setText("DD-MM-YYYY");



        datedDiffCalcB.setText("CALCULATE");

        datedDiffCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                datedDiffCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlDateDiffCalcLayout = new javax.swing.GroupLayout(pnlDateDiffCalc);

        pnlDateDiffCalc.setLayout(pnlDateDiffCalcLayout);

        pnlDateDiffCalcLayout.setHorizontalGroup(

            pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlDateDiffCalcLayout.createSequentialGroup()

                .addContainerGap(321, Short.MAX_VALUE)

                .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDateDiffCalcLayout.createSequentialGroup()

                        .addComponent(DateDiffBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDateDiffCalcLayout.createSequentialGroup()

                        .addComponent(jLabel4)

                        .addGap(313, 313, 313))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDateDiffCalcLayout.createSequentialGroup()

                        .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(datedDiffCalcB)

                            .addGroup(pnlDateDiffCalcLayout.createSequentialGroup()

                                .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(jLabel43)

                                    .addComponent(jLabel44))

                                .addGap(39, 39, 39)

                                .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                    .addComponent(startdatel1)

                                    .addComponent(enddatel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))

                        .addGap(347, 347, 347))))

        );

        pnlDateDiffCalcLayout.setVerticalGroup(

            pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlDateDiffCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(88, 88, 88)

                .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel43)

                    .addComponent(startdatel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(pnlDateDiffCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel44)

                    .addComponent(enddatel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(56, 56, 56)

                .addComponent(datedDiffCalcB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)

                .addComponent(DateDiffBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlDateDiffCalc, "cardDateDiffCalc");



        jLabel5.setBackground(new java.awt.Color(102, 51, 255));

        jLabel5.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel5.setText("AGE CALCULATOR");

        jLabel5.setOpaque(true);



        AgeCalcBackB.setText("BACK");

        AgeCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                AgeCalcBackBActionPerformed(evt);

            }

        });



        jLabel45.setText("Date Of Birth:");



        DOBl1.setText("DD/MM/YYYY");



        ageCalcButton.setText("CALCULATE");

        ageCalcButton.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                ageCalcButtonActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlAgeCalcLayout = new javax.swing.GroupLayout(pnlAgeCalc);

        pnlAgeCalc.setLayout(pnlAgeCalcLayout);

        pnlAgeCalcLayout.setHorizontalGroup(

            pnlAgeCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlAgeCalcLayout.createSequentialGroup()

                .addGroup(pnlAgeCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgeCalcLayout.createSequentialGroup()

                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(AgeCalcBackB))

                    .addGroup(pnlAgeCalcLayout.createSequentialGroup()

                        .addGap(384, 384, 384)

                        .addComponent(jLabel5)

                        .addGap(0, 368, Short.MAX_VALUE)))

                .addContainerGap())

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgeCalcLayout.createSequentialGroup()

                .addGap(0, 0, Short.MAX_VALUE)

                .addGroup(pnlAgeCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(ageCalcButton)

                    .addGroup(pnlAgeCalcLayout.createSequentialGroup()

                        .addComponent(jLabel45)

                        .addGap(31, 31, 31)

                        .addComponent(DOBl1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addGap(358, 358, 358))

        );

        pnlAgeCalcLayout.setVerticalGroup(

            pnlAgeCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlAgeCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(79, 79, 79)

                .addGroup(pnlAgeCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel45)

                    .addComponent(DOBl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(59, 59, 59)

                .addComponent(ageCalcButton)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)

                .addComponent(AgeCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlAgeCalc, "cardAgeCalc");



        jLabel6.setBackground(new java.awt.Color(102, 51, 255));

        jLabel6.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel6.setText("PERCENTAGE CALCULATOR");

        jLabel6.setOpaque(true);



        PerCalcBackB.setText("BACK");

        PerCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                PerCalcBackBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlPercentageCalcLayout = new javax.swing.GroupLayout(pnlPercentageCalc);

        pnlPercentageCalc.setLayout(pnlPercentageCalcLayout);

        pnlPercentageCalcLayout.setHorizontalGroup(

            pnlPercentageCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlPercentageCalcLayout.createSequentialGroup()

                .addContainerGap(340, Short.MAX_VALUE)

                .addGroup(pnlPercentageCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPercentageCalcLayout.createSequentialGroup()

                        .addComponent(PerCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPercentageCalcLayout.createSequentialGroup()

                        .addComponent(jLabel6)

                        .addGap(337, 337, 337))))

        );

        pnlPercentageCalcLayout.setVerticalGroup(

            pnlPercentageCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlPercentageCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)

                .addComponent(PerCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlPercentageCalc, "cardPercentageCalc");



        jLabel7.setBackground(new java.awt.Color(102, 21, 255));

        jLabel7.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel7.setText("DISCOUNT CALCULATOR");

        jLabel7.setOpaque(true);



        DisCalcBackB.setText("BACK");

        DisCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                DisCalcBackBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlDiscountCalcLayout = new javax.swing.GroupLayout(pnlDiscountCalc);

        pnlDiscountCalc.setLayout(pnlDiscountCalcLayout);

        pnlDiscountCalcLayout.setHorizontalGroup(

            pnlDiscountCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlDiscountCalcLayout.createSequentialGroup()

                .addContainerGap(355, Short.MAX_VALUE)

                .addGroup(pnlDiscountCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiscountCalcLayout.createSequentialGroup()

                        .addComponent(DisCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiscountCalcLayout.createSequentialGroup()

                        .addComponent(jLabel7)

                        .addGap(350, 350, 350))))

        );

        pnlDiscountCalcLayout.setVerticalGroup(

            pnlDiscountCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlDiscountCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)

                .addComponent(DisCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlDiscountCalc, "cardDiscountCalc");



        jLabel8.setBackground(new java.awt.Color(102, 21, 255));

        jLabel8.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel8.setText("QUADRATIC EQUATIONS CALCULATOR");

        jLabel8.setOpaque(true);



        QuadEqnBackB.setText("BACK");

        QuadEqnBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                QuadEqnBackBActionPerformed(evt);

            }

        });



        jLabel23.setText("Enter Co-Efficients Of Variables a,b,c from the following format: ax^2+bx+c");



        jButton1.setText("x^2");



        quadEqncmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        quadEqncmb1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                quadEqncmb1ActionPerformed(evt);

            }

        });



        quadEqnscmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        quadEqnscmb2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                quadEqnscmb2ActionPerformed(evt);

            }

        });



        jButton2.setText("x");



        quadEqnscmb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-" }));

        quadEqnscmb3.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                quadEqnscmb3ActionPerformed(evt);

            }

        });



        jButton3.setText("= 0");



        jTextArea1.setColumns(20);

        jTextArea1.setRows(5);

        jScrollPane1.setViewportView(jTextArea1);



        dta1.setColumns(20);

        dta1.setRows(5);

        jScrollPane2.setViewportView(dta1);



        QuadEqnShowB.setText("Show");

        QuadEqnShowB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                QuadEqnShowBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlQuadEqnsCalcLayout = new javax.swing.GroupLayout(pnlQuadEqnsCalc);

        pnlQuadEqnsCalc.setLayout(pnlQuadEqnsCalcLayout);

        pnlQuadEqnsCalcLayout.setHorizontalGroup(

            pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuadEqnsCalcLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addComponent(jScrollPane1))

            .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                .addContainerGap(278, Short.MAX_VALUE)

                .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addComponent(QuadEqnBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(jLabel23)

                            .addComponent(jLabel8))

                        .addGap(284, 284, 284))))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuadEqnsCalcLayout.createSequentialGroup()

                .addGap(0, 0, Short.MAX_VALUE)

                .addComponent(quadEqncmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addComponent(dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addComponent(jButton1)

                        .addGap(18, 18, 18)

                        .addComponent(quadEqnscmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jButton2)

                        .addGap(18, 18, 18)

                        .addComponent(quadEqnscmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(dt3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(18, 18, 18)

                        .addComponent(jButton3))

                    .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(55, 55, 55)

                        .addComponent(QuadEqnShowB)))

                .addGap(211, 211, 211))

        );

        pnlQuadEqnsCalcLayout.setVerticalGroup(

            pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(97, 97, 97)

                .addComponent(jLabel23)

                .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addGap(37, 37, 37)

                        .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                            .addComponent(jButton3)

                            .addGroup(pnlQuadEqnsCalcLayout.createSequentialGroup()

                                .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                    .addComponent(jButton2)

                                    .addComponent(quadEqnscmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(dt2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(1, 1, 1))

                            .addComponent(quadEqnscmb2)

                            .addGroup(pnlQuadEqnsCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                                .addComponent(jButton1)

                                .addComponent(dt1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addComponent(quadEqncmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addComponent(dt3))

                        .addGap(66, 66, 66)

                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)

                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuadEqnsCalcLayout.createSequentialGroup()

                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(QuadEqnShowB)

                        .addGap(185, 185, 185)))

                .addComponent(QuadEqnBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlQuadEqnsCalc, "cardQuadEqnsCalc");



        jLabel9.setBackground(new java.awt.Color(102, 51, 255));

        jLabel9.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel9.setText("LENGTH CONVERSION CALCULATOR");

        jLabel9.setOpaque(true);



        LengthConvCalcBackB.setText("BACK");

        LengthConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                LengthConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel39.setText("From:");



        jLabel41.setText("Length:");



        lengthConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer km", "Meter m", "Decimeter dm", "Centimeter cm", "Millimeter mm", "Micrometer um", "Nanometer nm", "Picometer pm", "Nautical Mile nmi", "Mile mi", "Yard yd", "Foot ft", "Inch in", "Parsec pc", "Lunar Distance ld", "Astronomical Unit", "Light Year ly" }));

        lengthConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                lengthConvCMB1ActionPerformed(evt);

            }

        });



        lengthConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometer km", "Meter m", "Decimeter dm", "Centimeter cm", "Millimeter mm", "Micrometer um", "Nanometer nm", "Picometer pm", "Nautical Mile nmi", "Mile mi", "Yard yd", "Foot ft", "Inch in", "Parsec pc", "Lunar Distance ld", "Astronomical Unit", "Light Year ly" }));

        lengthConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                lengthConvCMB2ActionPerformed(evt);

            }

        });



        jLabel42.setText("To");



        lengthConvCalcCalcB.setText("Calculate");

        lengthConvCalcCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                lengthConvCalcCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlLengthConvCalcLayout = new javax.swing.GroupLayout(pnlLengthConvCalc);

        pnlLengthConvCalc.setLayout(pnlLengthConvCalcLayout);

        pnlLengthConvCalcLayout.setHorizontalGroup(

            pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLengthConvCalcLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLengthConvCalcLayout.createSequentialGroup()

                        .addComponent(LengthConvCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLengthConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel9)

                        .addGap(285, 285, 285))))

            .addGroup(pnlLengthConvCalcLayout.createSequentialGroup()

                .addGap(246, 246, 246)

                .addGroup(pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(lengthConvCalcCalcB)

                    .addGroup(pnlLengthConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                            .addGroup(pnlLengthConvCalcLayout.createSequentialGroup()

                                .addComponent(jLabel41)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                .addComponent(lengthConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(pnlLengthConvCalcLayout.createSequentialGroup()

                                .addComponent(jLabel39)

                                .addGap(40, 40, 40)

                                .addComponent(lengthConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))

                        .addGap(18, 18, 18)

                        .addComponent(jLabel42)

                        .addGap(18, 18, 18)

                        .addComponent(lengthConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))

                .addGap(0, 269, Short.MAX_VALUE))

        );

        pnlLengthConvCalcLayout.setVerticalGroup(

            pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlLengthConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(77, 77, 77)

                .addGroup(pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel41)

                    .addComponent(lengthConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(33, 33, 33)

                .addGroup(pnlLengthConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel39)

                    .addComponent(lengthConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(lengthConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel42))

                .addGap(78, 78, 78)

                .addComponent(lengthConvCalcCalcB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)

                .addComponent(LengthConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlLengthConvCalc, "cardLengthConvCalc");



        jLabel10.setBackground(new java.awt.Color(102, 51, 255));

        jLabel10.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel10.setText("AREA CONVERSION CALCULATOR");

        jLabel10.setOpaque(true);



        AreaConvCalcBackB.setText("BACK");

        AreaConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                AreaConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel52.setText("Area:");



        jLabel53.setText("From:");



        areaConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square kilometer km^2", "Hectare ha", "Are a", "Square meter m^2", "Acre ac", "Square mile mile^2", "Square yard yd^2", "Square foot ft^2", "Square inch in^2" }));

        areaConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                areaConvCMB1ActionPerformed(evt);

            }

        });



        jLabel54.setText("To:");



        areaConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Square kilometer km^2", "Hectare ha", "Are a", "Square meter m^2", "Acre ac", "Square mile mile^2", "Square yard yd^2", "Square foot ft^2", "Square inch in^2" }));

        areaConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                areaConvCMB2ActionPerformed(evt);

            }

        });



        areaConvCalc.setText("Calculate");

        areaConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                areaConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlAreaConvCalcLayout = new javax.swing.GroupLayout(pnlAreaConvCalc);

        pnlAreaConvCalc.setLayout(pnlAreaConvCalcLayout);

        pnlAreaConvCalcLayout.setHorizontalGroup(

            pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlAreaConvCalcLayout.createSequentialGroup()

                .addContainerGap(272, Short.MAX_VALUE)

                .addGroup(pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel10)

                        .addGap(295, 295, 295))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlAreaConvCalcLayout.createSequentialGroup()

                                .addComponent(jLabel52)

                                .addGap(18, 18, 18)

                                .addComponent(areaConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addGroup(pnlAreaConvCalcLayout.createSequentialGroup()

                                .addComponent(jLabel53)

                                .addGap(18, 18, 18)

                                .addComponent(areaConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(38, 38, 38)

                                .addGroup(pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                    .addComponent(areaConvCalc)

                                    .addGroup(pnlAreaConvCalcLayout.createSequentialGroup()

                                        .addComponent(jLabel54)

                                        .addGap(18, 18, 18)

                                        .addComponent(areaConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))

                        .addGap(269, 269, 269))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaConvCalcLayout.createSequentialGroup()

                        .addComponent(AreaConvCalcBackB)

                        .addGap(67, 67, 67))))

        );

        pnlAreaConvCalcLayout.setVerticalGroup(

            pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlAreaConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(99, 99, 99)

                .addGroup(pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel52)

                    .addComponent(areaConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(28, 28, 28)

                .addGroup(pnlAreaConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel53)

                    .addComponent(areaConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel54)

                    .addComponent(areaConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(61, 61, 61)

                .addComponent(areaConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)

                .addComponent(AreaConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlAreaConvCalc, "cardAreaConvCalc");



        jLabel11.setBackground(new java.awt.Color(102, 21, 255));

        jLabel11.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel11.setText("VOLUME CONVERSION CALCULATOR");

        jLabel11.setOpaque(true);



        VolumeConvCalcBackB.setText("BACK");

        VolumeConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                VolumeConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel55.setText("Volume:");



        jLabel56.setText("From:");



        volumeConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cubic meter m^3", "Cubic decimeter dm^3", "Cubic centimeter cm^3", "Cubic millimeter mm^3", "Hectolitre hl", "Litre l", "Decilitre dl", "Centiletre cl", "Milliletre ml", " " }));

        volumeConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                volumeConvCMB1ActionPerformed(evt);

            }

        });



        jLabel57.setText("To:");



        volumeConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cubic meter m^3", "Cubic decimeter dm^3", "Cubic centimeter cm^3", "Cubic millimeter mm^3", "Hectolitre hl", "Litre l", "Decilitre dl", "Centiletre cl", "Milliletre ml", " " }));

        volumeConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                volumeConvCMB2ActionPerformed(evt);

            }

        });



        volumeConvCalc.setText("Calculate");

        volumeConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                volumeConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlVolumeConvCalcLayout = new javax.swing.GroupLayout(pnlVolumeConvCalc);

        pnlVolumeConvCalc.setLayout(pnlVolumeConvCalcLayout);

        pnlVolumeConvCalcLayout.setHorizontalGroup(

            pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlVolumeConvCalcLayout.createSequentialGroup()

                .addContainerGap(321, Short.MAX_VALUE)

                .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVolumeConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel11)

                        .addGap(273, 273, 273))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVolumeConvCalcLayout.createSequentialGroup()

                        .addComponent(VolumeConvCalcBackB)

                        .addContainerGap())))

            .addGroup(pnlVolumeConvCalcLayout.createSequentialGroup()

                .addGap(301, 301, 301)

                .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(volumeConvCalc)

                    .addGroup(pnlVolumeConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel55)

                            .addComponent(jLabel56))

                        .addGap(18, 18, 18)

                        .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlVolumeConvCalcLayout.createSequentialGroup()

                                .addComponent(volumeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(60, 60, 60)

                                .addComponent(jLabel57)

                                .addGap(18, 18, 18)

                                .addComponent(volumeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                            .addComponent(volumeConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))

                .addGap(0, 0, Short.MAX_VALUE))

        );

        pnlVolumeConvCalcLayout.setVerticalGroup(

            pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlVolumeConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(75, 75, 75)

                .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel55)

                    .addComponent(volumeConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(27, 27, 27)

                .addGroup(pnlVolumeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel56)

                    .addComponent(volumeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel57)

                    .addComponent(volumeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(50, 50, 50)

                .addComponent(volumeConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)

                .addComponent(VolumeConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlVolumeConvCalc, "cardVolumeConvCalc");



        jLabel12.setBackground(new java.awt.Color(102, 21, 255));

        jLabel12.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel12.setText("SPEED CONVERSION CALCULATOR");

        jLabel12.setOpaque(true);



        SpeedConvCalcBackB.setText("BACK");

        SpeedConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                SpeedConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel58.setText("Speed:");



        jLabel59.setText("From:");



        speedConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lightspeed c", "Mach Ma", "Meter per second m/s", "Kilometer per hour km/h", "Kilometer per second km/s", "Knot kn", "Mile per hour mph", " " }));

        speedConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                speedConvCMB1ActionPerformed(evt);

            }

        });



        jLabel60.setText("To:");



        speedConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lightspeed c", "Mach Ma", "Meter per second m/s", "Kilometer per hour km/h", "Kilometer per second km/s", "Knot kn", "Mile per hour mph", " " }));

        speedConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                speedConvCMB2ActionPerformed(evt);

            }

        });



        speedConvCalc.setText("CALCULATE");

        speedConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                speedConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlSpeedConvCalcLayout = new javax.swing.GroupLayout(pnlSpeedConvCalc);

        pnlSpeedConvCalc.setLayout(pnlSpeedConvCalcLayout);

        pnlSpeedConvCalcLayout.setHorizontalGroup(

            pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSpeedConvCalcLayout.createSequentialGroup()

                .addGap(308, 308, 308)

                .addComponent(jLabel12)

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpeedConvCalcLayout.createSequentialGroup()

                .addContainerGap(259, Short.MAX_VALUE)

                .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpeedConvCalcLayout.createSequentialGroup()

                        .addComponent(SpeedConvCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSpeedConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel58)

                            .addComponent(jLabel59))

                        .addGap(18, 18, 18)

                        .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlSpeedConvCalcLayout.createSequentialGroup()

                                .addComponent(speedConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(39, 39, 39)

                                .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                    .addComponent(speedConvCalc)

                                    .addGroup(pnlSpeedConvCalcLayout.createSequentialGroup()

                                        .addComponent(jLabel60)

                                        .addGap(18, 18, 18)

                                        .addComponent(speedConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))

                            .addComponent(speedConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))

                        .addGap(245, 245, 245))))

        );

        pnlSpeedConvCalcLayout.setVerticalGroup(

            pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSpeedConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(96, 96, 96)

                .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel58)

                    .addComponent(speedConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(39, 39, 39)

                .addGroup(pnlSpeedConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel59)

                    .addComponent(speedConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel60)

                    .addComponent(speedConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(50, 50, 50)

                .addComponent(speedConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)

                .addComponent(SpeedConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlSpeedConvCalc, "cardSpeedConvCalc");



        jLabel13.setBackground(new java.awt.Color(102, 21, 255));

        jLabel13.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel13.setText("TIME CONVERSION CALCULATOR");

        jLabel13.setOpaque(true);



        TimeConvCalcBackB.setText("BACK");

        TimeConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                TimeConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel61.setText("Time:");



        jLabel62.setText("From:");



        timeConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year y", "Week wk", "Day d", "Hour h", "Minute min", "Second s", "Millisecond ms", "Microsecond μs", "Picosend ps" }));

        timeConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                timeConvCMB1ActionPerformed(evt);

            }

        });



        jLabel63.setText("To:");



        timeConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year y", "Week wk", "Day d", "Hour h", "Minute min", "Second s", "Millisecond ms", "Microsecond μs", "Picosend ps" }));

        timeConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                timeConvCMB2ActionPerformed(evt);

            }

        });



        timeConvCalc.setText("CALCULATE");

        timeConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                timeConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlTimeConvCalcLayout = new javax.swing.GroupLayout(pnlTimeConvCalc);

        pnlTimeConvCalc.setLayout(pnlTimeConvCalcLayout);

        pnlTimeConvCalcLayout.setHorizontalGroup(

            pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                .addGroup(pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(TimeConvCalcBackB))

                    .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                        .addGap(314, 314, 314)

                        .addGroup(pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTimeConvCalcLayout.createSequentialGroup()

                                    .addGap(196, 196, 196)

                                    .addComponent(timeConvCalc))

                                .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel61)

                                    .addGap(18, 18, 18)

                                    .addComponent(timeConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel62)

                                    .addGap(18, 18, 18)

                                    .addComponent(timeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGap(36, 36, 36)

                                    .addComponent(jLabel63)

                                    .addGap(18, 18, 18)

                                    .addComponent(timeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))

                            .addComponent(jLabel13))

                        .addGap(0, 293, Short.MAX_VALUE)))

                .addContainerGap())

        );

        pnlTimeConvCalcLayout.setVerticalGroup(

            pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlTimeConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(75, 75, 75)

                .addGroup(pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel61)

                    .addComponent(timeConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(43, 43, 43)

                .addGroup(pnlTimeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel62)

                    .addComponent(timeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel63)

                    .addComponent(timeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(94, 94, 94)

                .addComponent(timeConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)

                .addComponent(TimeConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlTimeConvCalc, "cardTimeConvCalc");



        MassConvCalcBackB.setText("BACK");

        MassConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                MassConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel14.setBackground(new java.awt.Color(102, 21, 255));

        jLabel14.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel14.setText("MASS CONVERSION CALCULATION");

        jLabel14.setOpaque(true);



        jLabel64.setText("Mass");



        jLabel65.setText("From:");



        massConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonne t", "Kilogram kg", "Gram g", "Milligram mg", "Microgram μg", "Quintal q", "Pound lb", "Ounce oz", "Carat ct" }));

        massConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                massConvCMB1ActionPerformed(evt);

            }

        });



        jLabel66.setText("To:");



        massConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tonne t", "Kilogram kg", "Gram g", "Milligram mg", "Microgram μg", "Quintal q", "Pound lb", "Ounce oz", "Carat ct" }));

        massConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                massConvCMB2ActionPerformed(evt);

            }

        });



        massConvCalc.setText("CALCULATE");

        massConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                massConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlMassConvCalcLayout = new javax.swing.GroupLayout(pnlMassConvCalc);

        pnlMassConvCalc.setLayout(pnlMassConvCalcLayout);

        pnlMassConvCalcLayout.setHorizontalGroup(

            pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMassConvCalcLayout.createSequentialGroup()

                .addContainerGap(313, Short.MAX_VALUE)

                .addGroup(pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMassConvCalcLayout.createSequentialGroup()

                        .addComponent(MassConvCalcBackB)

                        .addContainerGap())

                    .addGroup(pnlMassConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel64)

                        .addGap(18, 18, 18)

                        .addComponent(massConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMassConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(massConvCalc)

                            .addGroup(pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                .addGroup(pnlMassConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel65)

                                    .addGap(26, 26, 26)

                                    .addComponent(massConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                    .addComponent(jLabel66)

                                    .addGap(18, 18, 18)

                                    .addComponent(massConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addComponent(jLabel14)))

                        .addGap(296, 296, 296))))

        );

        pnlMassConvCalcLayout.setVerticalGroup(

            pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMassConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(72, 72, 72)

                .addGroup(pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel64)

                    .addComponent(massConvCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(45, 45, 45)

                .addGroup(pnlMassConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel65)

                    .addComponent(massConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel66)

                    .addComponent(massConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(53, 53, 53)

                .addComponent(massConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)

                .addComponent(MassConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlMassConvCalc, "cardMassConvCalc");



        jLabel15.setBackground(new java.awt.Color(102, 21, 255));

        jLabel15.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel15.setText("NUMERAL SYSTEM CONVERSION CALCULATOR");

        jLabel15.setOpaque(true);



        NumSysConvCalcBackB.setText("BACK");

        NumSysConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                NumSysConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel67.setText("Digit:");



        jLabel68.setText("From:");



        numSysConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary BIN", "Octal OCT", "Decimal DEC", "Hexadecimal HEX" }));



        jLabel69.setText("To:");



        numSysConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binary BIN", "Octal OCT", "Decimal DEC", "Hexadecimal HEX" }));



        numSysConvCalc.setText("CALCULATE");



        javax.swing.GroupLayout pnlNumSystemConvCalcLayout = new javax.swing.GroupLayout(pnlNumSystemConvCalc);

        pnlNumSystemConvCalc.setLayout(pnlNumSystemConvCalcLayout);

        pnlNumSystemConvCalcLayout.setHorizontalGroup(

            pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumSystemConvCalcLayout.createSequentialGroup()

                .addContainerGap(248, Short.MAX_VALUE)

                .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumSystemConvCalcLayout.createSequentialGroup()

                        .addComponent(NumSysConvCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNumSystemConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel15)

                        .addGap(246, 246, 246))))

            .addGroup(pnlNumSystemConvCalcLayout.createSequentialGroup()

                .addGap(276, 276, 276)

                .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(numSysConvCalc)

                    .addGroup(pnlNumSystemConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(jLabel68)

                            .addComponent(jLabel67))

                        .addGap(18, 18, 18)

                        .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(numSysConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addGroup(pnlNumSystemConvCalcLayout.createSequentialGroup()

                                .addComponent(numSysConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(75, 75, 75)

                                .addComponent(jLabel69)

                                .addGap(18, 18, 18)

                                .addComponent(numSysConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))

                .addGap(0, 0, Short.MAX_VALUE))

        );

        pnlNumSystemConvCalcLayout.setVerticalGroup(

            pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlNumSystemConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(94, 94, 94)

                .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel67)

                    .addComponent(numSysConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(31, 31, 31)

                .addGroup(pnlNumSystemConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel68)

                    .addComponent(numSysConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel69)

                    .addComponent(numSysConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(52, 52, 52)

                .addComponent(numSysConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)

                .addComponent(NumSysConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlNumSystemConvCalc, "cardNumSysConvCalc");



        jLabel16.setBackground(new java.awt.Color(102, 21, 255));

        jLabel16.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel16.setText("TEMPERATURE CONVERSION CACULATOR");

        jLabel16.setOpaque(true);



        TempConvCalcBackB.setText("BACK");

        TempConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                TempConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel49.setText("Temperature:");



        jLabel50.setText("From:");



        tempConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius ˚C", "Farenheit ˚F", "Kelvin K", "Rankine ˚R", "Réaumur ˚Re " }));

        tempConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                tempConvCMB1ActionPerformed(evt);

            }

        });



        jLabel51.setText("To:");



        tempConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius ˚C", "Farenheit ˚F", "Kelvin K", "Rankine ˚R", "Réaumur ˚Re " }));

        tempConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                tempConvCMB2ActionPerformed(evt);

            }

        });



        tempConvCalc.setText("Calculate");

        tempConvCalc.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                tempConvCalcActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlTemperatureConvCalcLayout = new javax.swing.GroupLayout(pnlTemperatureConvCalc);

        pnlTemperatureConvCalc.setLayout(pnlTemperatureConvCalcLayout);

        pnlTemperatureConvCalcLayout.setHorizontalGroup(

            pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTemperatureConvCalcLayout.createSequentialGroup()

                .addContainerGap(292, Short.MAX_VALUE)

                .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTemperatureConvCalcLayout.createSequentialGroup()

                            .addComponent(TempConvCalcBackB)

                            .addContainerGap())

                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTemperatureConvCalcLayout.createSequentialGroup()

                            .addComponent(jLabel16)

                            .addGap(253, 253, 253)))

                    .addGroup(pnlTemperatureConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(tempConvCalc)

                            .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                .addGroup(pnlTemperatureConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel50)

                                    .addGap(18, 18, 18)

                                    .addComponent(tempConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGap(85, 85, 85)

                                    .addComponent(jLabel51)

                                    .addGap(18, 18, 18)

                                    .addComponent(tempConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGroup(pnlTemperatureConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel49)

                                    .addGap(18, 18, 18)

                                    .addComponent(tempConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))

                        .addContainerGap())))

        );

        pnlTemperatureConvCalcLayout.setVerticalGroup(

            pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlTemperatureConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(84, 84, 84)

                .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel49)

                    .addComponent(tempConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(41, 41, 41)

                .addGroup(pnlTemperatureConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel50)

                    .addComponent(tempConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel51)

                    .addComponent(tempConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(65, 65, 65)

                .addComponent(tempConvCalc)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, Short.MAX_VALUE)

                .addComponent(TempConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlTemperatureConvCalc, "cardTemperatureConvCalc");



        jLabel17.setBackground(new java.awt.Color(102, 21, 255));

        jLabel17.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel17.setText("STORAGE SIZE CONVERSION CALCULATOR");

        jLabel17.setOpaque(true);



        StorageSizeConvCalcBackB.setText("BACK");

        StorageSizeConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                StorageSizeConvCalcBackBActionPerformed(evt);

            }

        });



        jLabel46.setText("Size:");



        jLabel47.setText("From:");



        sizeConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Byte B", "Kilobyte KB", "Megabyte MB", "Gigabyte GB", "Terabyte TB", "Petabyte PB" }));

        sizeConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                sizeConvCMB1ActionPerformed(evt);

            }

        });



        jLabel48.setText("To:");



        sizeConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Byte B", "Kilobyte KB", "Megabyte MB", "Gigabyte GB", "Terabyte TB", "Petabyte PB" }));

        sizeConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                sizeConvCMB2ActionPerformed(evt);

            }

        });



        sizeConvCalcB.setText("Calculate");

        sizeConvCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                sizeConvCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlStorageSizeConvCalcLayout = new javax.swing.GroupLayout(pnlStorageSizeConvCalc);

        pnlStorageSizeConvCalc.setLayout(pnlStorageSizeConvCalcLayout);

        pnlStorageSizeConvCalcLayout.setHorizontalGroup(

            pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlStorageSizeConvCalcLayout.createSequentialGroup()

                .addContainerGap(274, Short.MAX_VALUE)

                .addGroup(pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStorageSizeConvCalcLayout.createSequentialGroup()

                        .addComponent(StorageSizeConvCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStorageSizeConvCalcLayout.createSequentialGroup()

                        .addComponent(jLabel17)

                        .addGap(255, 255, 255))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStorageSizeConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addComponent(sizeConvCalcB)

                            .addGroup(pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                .addGroup(pnlStorageSizeConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel47)

                                    .addGap(18, 18, 18)

                                    .addComponent(sizeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGap(64, 64, 64)

                                    .addComponent(jLabel48)

                                    .addGap(18, 18, 18)

                                    .addComponent(sizeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGroup(pnlStorageSizeConvCalcLayout.createSequentialGroup()

                                    .addComponent(jLabel46)

                                    .addGap(18, 18, 18)

                                    .addComponent(sizeConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))

                        .addGap(291, 291, 291))))

        );

        pnlStorageSizeConvCalcLayout.setVerticalGroup(

            pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlStorageSizeConvCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(85, 85, 85)

                .addGroup(pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel46)

                    .addComponent(sizeConvT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(44, 44, 44)

                .addGroup(pnlStorageSizeConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel47)

                    .addComponent(sizeConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel48)

                    .addComponent(sizeConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(59, 59, 59)

                .addComponent(sizeConvCalcB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)

                .addComponent(StorageSizeConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlStorageSizeConvCalc, "cardStorageSizeConvCalc");



        InvestmentCalcBackB.setText("BACK");

        InvestmentCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                InvestmentCalcBackBActionPerformed(evt);

            }

        });



        jLabel18.setBackground(new java.awt.Color(102, 21, 255));

        jLabel18.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel18.setText("INVESTMENT CACULATOR");

        jLabel18.setOpaque(true);



        buttonGroup2.add(jRadioButton1);

        jRadioButton1.setText("One-Time");



        buttonGroup2.add(jRadioButton2);

        jRadioButton2.setText("Recurring Monthly");



        investmentCalcCalcB.setText("Calculate");

        investmentCalcCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                investmentCalcCalcBActionPerformed(evt);

            }

        });



        jRadioButton3.setText("Recurring Quarterly");



        jRadioButton4.setText("Recurring Yearly");



        jLabel36.setText("Investment                      :");



        jLabel37.setText("Interest (Percentage)     :");



        jLabel38.setText("Duration                          :");



        investmentCalcCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Year", "1 Year", "2 Years", "3 Years", "4 Years", "5 Years", "6 Years", "7 Years", "8 Years", "9 Years", "10 Years", "11 Years", "12 Years", "13 Years", "14 Years", "15 Years", "16 Years", "17 Years", "18 Years", "19 Years", "20 Years", "21 Years", "22 Years", "23 Years", "24 Years", "25 Years", "26 Years", "27 Years", "28 Years", "29 Years", "30 Years" }));

        investmentCalcCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                investmentCalcCMB1ActionPerformed(evt);

            }

        });



        investmentCalcCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Month", "1 Month", "2 Months", "3 Months", "4 Months", "5 Months", "6 Months", "7 Months", "8 Months", "9 Months", "10 Months", "11 Months" }));

        investmentCalcCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                investmentCalcCMB2ActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlInvestmentCalcLayout = new javax.swing.GroupLayout(pnlInvestmentCalc);

        pnlInvestmentCalc.setLayout(pnlInvestmentCalcLayout);

        pnlInvestmentCalcLayout.setHorizontalGroup(

            pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlInvestmentCalcLayout.createSequentialGroup()

                .addContainerGap(247, Short.MAX_VALUE)

                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvestmentCalcLayout.createSequentialGroup()

                        .addComponent(jRadioButton1)

                        .addGap(18, 18, 18)

                        .addComponent(jRadioButton2)

                        .addGap(18, 18, 18)

                        .addComponent(jRadioButton3)

                        .addGap(18, 18, 18)

                        .addComponent(jRadioButton4)

                        .addGap(220, 220, 220))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvestmentCalcLayout.createSequentialGroup()

                        .addComponent(InvestmentCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvestmentCalcLayout.createSequentialGroup()

                        .addComponent(jLabel18)

                        .addGap(348, 348, 348))

                    .addGroup(pnlInvestmentCalcLayout.createSequentialGroup()

                        .addGap(40, 40, 40)

                        .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                            .addGroup(pnlInvestmentCalcLayout.createSequentialGroup()

                                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addComponent(jLabel36))

                                .addGap(52, 52, 52)

                                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                    .addGroup(pnlInvestmentCalcLayout.createSequentialGroup()

                                        .addComponent(investmentCalcCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(investmentCalcCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                    .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                        .addComponent(investmentCalcT2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)

                                        .addComponent(investmentCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))

                            .addComponent(investmentCalcCalcB))

                        .addContainerGap())))

        );

        pnlInvestmentCalcLayout.setVerticalGroup(

            pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInvestmentCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(67, 67, 67)

                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jRadioButton2)

                    .addComponent(jRadioButton1)

                    .addComponent(jRadioButton3)

                    .addComponent(jRadioButton4))

                .addGap(34, 34, 34)

                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel36)

                    .addComponent(investmentCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(21, 21, 21)

                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel37)

                    .addComponent(investmentCalcT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(21, 21, 21)

                .addGroup(pnlInvestmentCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel38)

                    .addComponent(investmentCalcCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(investmentCalcCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)

                .addComponent(investmentCalcCalcB)

                .addGap(167, 167, 167)

                .addComponent(InvestmentCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlInvestmentCalc, "cardInvestmentCalc");



        jLabel19.setBackground(new java.awt.Color(102, 21, 255));

        jLabel19.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel19.setText("CURRENCY CONVERSION CALCULATOR");

        jLabel19.setOpaque(true);



        CurrencyConvCalcBackB.setText("BACK");

        CurrencyConvCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                CurrencyConvCalcBackBActionPerformed(evt);

            }

        });



        currencyConvCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AED United Arab Emirates dirham ", "EUR Euro ", "GBP British pound sterling ", "INR Indian rupee ", "JPY Japanese yen ", "USD United States dollar" }));

        currencyConvCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                currencyConvCMB2ActionPerformed(evt);

            }

        });



        currencyConvCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AED United Arab Emirates dirham ", "EUR Euro ", "GBP British pound sterling ", "INR Indian rupee ", "JPY Japanese yen ", "USD United States dollar" }));

        currencyConvCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                currencyConvCMB1ActionPerformed(evt);

            }

        });



        currencyConvCalculateB.setText("CALCULATE");

        currencyConvCalculateB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                currencyConvCalculateBActionPerformed(evt);

            }

        });



        jLabel28.setText("   To");



        jLabel29.setText("Amount:");



        jLabel40.setText("From:");



        javax.swing.GroupLayout pnlCurrencyConvCalcLayout = new javax.swing.GroupLayout(pnlCurrencyConvCalc);

        pnlCurrencyConvCalc.setLayout(pnlCurrencyConvCalcLayout);

        pnlCurrencyConvCalcLayout.setHorizontalGroup(

            pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                        .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                                .addGap(276, 276, 276)

                                .addComponent(jLabel19)

                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE))

                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCurrencyConvCalcLayout.createSequentialGroup()

                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                .addComponent(jLabel40)

                                .addGap(39, 39, 39)

                                .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                                    .addComponent(currencyConvCMB1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCurrencyConvCalcLayout.createSequentialGroup()

                                        .addComponent(jLabel29)

                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                                        .addComponent(currencyConvL1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))

                                .addGap(18, 18, 18)

                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)

                                .addGap(18, 18, 18)

                                .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                    .addComponent(currencyConvCalculateB)

                                    .addComponent(currencyConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addGap(148, 148, 148)))

                        .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jLabel27)

                            .addComponent(jLabel26)))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCurrencyConvCalcLayout.createSequentialGroup()

                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                        .addComponent(CurrencyConvCalcBackB)))

                .addContainerGap())

        );

        pnlCurrencyConvCalcLayout.setVerticalGroup(

            pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                        .addContainerGap()

                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                        .addGap(107, 107, 107)

                        .addComponent(jLabel27)

                        .addGap(49, 49, 49)

                        .addComponent(jLabel26))

                    .addGroup(pnlCurrencyConvCalcLayout.createSequentialGroup()

                        .addGap(127, 127, 127)

                        .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(currencyConvL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jLabel29))

                        .addGap(33, 33, 33)

                        .addGroup(pnlCurrencyConvCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                            .addComponent(currencyConvCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jLabel28)

                            .addComponent(currencyConvCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                            .addComponent(jLabel40))))

                .addGap(60, 60, 60)

                .addComponent(currencyConvCalculateB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)

                .addComponent(CurrencyConvCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlCurrencyConvCalc, "cardCurrencyConvCalc");



        pnlSplitBillCalc.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseEntered(java.awt.event.MouseEvent evt) {

                pnlSplitBillCalcMouseEntered(evt);

            }

        });



        jLabel20.setBackground(new java.awt.Color(102, 21, 255));

        jLabel20.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel20.setText("SPLIT BILL CALCULATOR");

        jLabel20.setOpaque(true);



        SplitBillCalcBackB.setText("BACK");

        SplitBillCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                SplitBillCalcBackBActionPerformed(evt);

            }

        });



        jLabel24.setText("Amount");



        jLabel25.setText("People");



        jLabel30.setText("Split Amount");



        splitBillCalcCalcB.setText("Calculate");

        splitBillCalcCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                splitBillCalcCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlSplitBillCalcLayout = new javax.swing.GroupLayout(pnlSplitBillCalc);

        pnlSplitBillCalc.setLayout(pnlSplitBillCalcLayout);

        pnlSplitBillCalcLayout.setHorizontalGroup(

            pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSplitBillCalcLayout.createSequentialGroup()

                .addGap(363, 363, 363)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel24)

                    .addComponent(jLabel25)

                    .addComponent(jLabel30))

                .addGap(75, 75, 75)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                    .addComponent(splitamtSplitBillCalcT1)

                    .addComponent(pplSplitBillCalcT2)

                    .addComponent(amtSplitBillCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(0, 0, Short.MAX_VALUE))

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSplitBillCalcLayout.createSequentialGroup()

                .addContainerGap(354, Short.MAX_VALUE)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSplitBillCalcLayout.createSequentialGroup()

                        .addComponent(SplitBillCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSplitBillCalcLayout.createSequentialGroup()

                        .addComponent(jLabel20)

                        .addGap(347, 347, 347))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSplitBillCalcLayout.createSequentialGroup()

                        .addComponent(splitBillCalcCalcB)

                        .addGap(284, 284, 284))))

        );

        pnlSplitBillCalcLayout.setVerticalGroup(

            pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlSplitBillCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(79, 79, 79)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(amtSplitBillCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel24))

                .addGap(18, 18, 18)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(pplSplitBillCalcT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel25))

                .addGap(19, 19, 19)

                .addComponent(splitBillCalcCalcB)

                .addGap(26, 26, 26)

                .addGroup(pnlSplitBillCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(splitamtSplitBillCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(jLabel30))

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)

                .addComponent(SplitBillCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlSplitBillCalc, "cardSplitBillCalc");



        jLabel21.setBackground(new java.awt.Color(102, 21, 255));

        jLabel21.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel21.setText("LOAN CALCULATOR");

        jLabel21.setOpaque(true);



        LoanCalcBackB.setText("BACK");

        LoanCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                LoanCalcBackBActionPerformed(evt);

            }

        });



        jLabel31.setText("Principal");



        jLabel32.setText("Interest (percentage)");



        jLabel33.setText("Loan Tenure");



        monthLoanCalcCMB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Month", "1 Month", "2 Months", "3 Months", "4 Months", "5 Months", "6 Months", "7 Months", "8 Months", "9 Months", "10 Months", "11 Months" }));

        monthLoanCalcCMB2.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                monthLoanCalcCMB2ActionPerformed(evt);

            }

        });



        yearsLoanCalcCMB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0 Year", "1 Year", "2 Years", "3 Years", "4 Years", "5 Years", "6 Years", "7 Years", "8 Years", "9 Years", "10 Years", "11 Years", "12 Years", "13 Years", "14 Years", "15 Years", "16 Years", "17 Years", "18 Years", "19 Years", "20 Years", "21 Years", "22 Years", "23 Years", "24 Years", "25 Years", "26 Years", "27 Years", "28 Years", "29 Years", "30 Years" }));

        yearsLoanCalcCMB1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                yearsLoanCalcCMB1ActionPerformed(evt);

            }

        });



        loanCalcCalcB.setText("Calculate");

        loanCalcCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                loanCalcCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlLoanCalcLayout = new javax.swing.GroupLayout(pnlLoanCalc);

        pnlLoanCalc.setLayout(pnlLoanCalcLayout);

        pnlLoanCalcLayout.setHorizontalGroup(

            pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlLoanCalcLayout.createSequentialGroup()

                .addContainerGap(381, Short.MAX_VALUE)

                .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanCalcLayout.createSequentialGroup()

                        .addComponent(LoanCalcBackB)

                        .addContainerGap())

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanCalcLayout.createSequentialGroup()

                        .addComponent(jLabel21)

                        .addGap(366, 366, 366))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoanCalcLayout.createSequentialGroup()

                            .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)

                                .addComponent(amtLoanCalcT1)

                                .addComponent(interestLoanCalcT2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))

                            .addGap(325, 325, 325))

                        .addGroup(pnlLoanCalcLayout.createSequentialGroup()

                            .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                                .addGroup(pnlLoanCalcLayout.createSequentialGroup()

                                    .addComponent(yearsLoanCalcCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                                    .addGap(18, 18, 18)

                                    .addComponent(monthLoanCalcCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                                .addComponent(loanCalcCalcB))

                            .addContainerGap()))))

            .addGroup(pnlLoanCalcLayout.createSequentialGroup()

                .addGap(344, 344, 344)

                .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addComponent(jLabel33)

                    .addComponent(jLabel32)

                    .addComponent(jLabel31))

                .addGap(0, 0, Short.MAX_VALUE))

        );

        pnlLoanCalcLayout.setVerticalGroup(

            pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlLoanCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)

                .addGap(107, 107, 107)

                .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel31)

                    .addComponent(amtLoanCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel32)

                    .addComponent(interestLoanCalcT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(pnlLoanCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel33)

                    .addComponent(yearsLoanCalcCMB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)

                    .addComponent(monthLoanCalcCMB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(44, 44, 44)

                .addComponent(loanCalcCalcB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)

                .addComponent(LoanCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlLoanCalc, "cardLoanCalc");



        jLabel22.setBackground(new java.awt.Color(102, 21, 255));

        jLabel22.setFont(new java.awt.Font("Bradley Hand ITC", 1, 18)); // NOI18N

        jLabel22.setText("GST CALCULATOR");

        jLabel22.setOpaque(true);



        GSTCalcBackB.setText("BACK");

        GSTCalcBackB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                GSTCalcBackBActionPerformed(evt);

            }

        });



        jLabel34.setText("Original Price");



        gstCalcT1.setForeground(new java.awt.Color(102, 102, 102));



        jLabel35.setText("GST");



        buttonGroup1.add(gstCalcR1);

        gstCalcR1.setText("3%");



        buttonGroup1.add(gstCalcR2);

        gstCalcR2.setText("5%");



        buttonGroup1.add(gstCalcR3);

        gstCalcR3.setText("12%");



        buttonGroup1.add(gstCalcR4);

        gstCalcR4.setText("18%");



        buttonGroup1.add(gstCalcR5);

        gstCalcR5.setText("28%");



        gstCalcCalcB.setText("Calculate");

        gstCalcCalcB.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                gstCalcCalcBActionPerformed(evt);

            }

        });



        javax.swing.GroupLayout pnlGSTCalcLayout = new javax.swing.GroupLayout(pnlGSTCalc);

        pnlGSTCalc.setLayout(pnlGSTCalcLayout);

        pnlGSTCalcLayout.setHorizontalGroup(

            pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGSTCalcLayout.createSequentialGroup()

                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

                .addGroup(pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGSTCalcLayout.createSequentialGroup()

                        .addComponent(jLabel22)

                        .addGap(382, 382, 382))

                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGSTCalcLayout.createSequentialGroup()

                        .addComponent(GSTCalcBackB)

                        .addContainerGap())))

            .addGroup(pnlGSTCalcLayout.createSequentialGroup()

                .addGap(318, 318, 318)

                .addGroup(pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)

                    .addComponent(gstCalcCalcB)

                    .addGroup(pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)

                        .addGroup(pnlGSTCalcLayout.createSequentialGroup()

                            .addComponent(jLabel35)

                            .addGap(30, 30, 30)

                            .addComponent(gstCalcR1)

                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                            .addComponent(gstCalcR2)

                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                            .addComponent(gstCalcR3)

                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                            .addComponent(gstCalcR4)

                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)

                            .addComponent(gstCalcR5))

                        .addGroup(pnlGSTCalcLayout.createSequentialGroup()

                            .addComponent(jLabel34)

                            .addGap(116, 116, 116)

                            .addComponent(gstCalcT1))))

                .addGap(0, 323, Short.MAX_VALUE))

        );

        pnlGSTCalcLayout.setVerticalGroup(

            pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

            .addGroup(pnlGSTCalcLayout.createSequentialGroup()

                .addContainerGap()

                .addComponent(jLabel22)

                .addGap(102, 102, 102)

                .addGroup(pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel34)

                    .addComponent(gstCalcT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(18, 18, 18)

                .addGroup(pnlGSTCalcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)

                    .addComponent(jLabel35)

                    .addComponent(gstCalcR1)

                    .addComponent(gstCalcR2)

                    .addComponent(gstCalcR3)

                    .addComponent(gstCalcR4)

                    .addComponent(gstCalcR5))

                .addGap(44, 44, 44)

                .addComponent(gstCalcCalcB)

                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)

                .addComponent(GSTCalcBackB)

                .addContainerGap())

        );



        getContentPane().add(pnlGSTCalc, "cardGSTCalc");



        pack();

    }// </editor-fold>//GEN-END:initComponents

    void discriminantShow()
    {
        dta1.setText(null);

        a=Integer.parseInt(dt1.getText());

        b=Integer.parseInt(dt2.getText());

        c=Integer.parseInt(dt3.getText());

        if(fs==1)
          a=-a;
        if(ms==1)
          b=-b;
        if(ls==1)
          c=-c;
        //Digits +ve OOR -ve Done....
        if(a==0)
            dta1.append("Invalid");
        int d= b*b-4*a*c;
        double sqrt_val=sqrt(abs(d));
        if(d>0)
        {
           dta1.append("Roots are real and different"+"\n\n");
           dta1.append((double)(-b+sqrt_val)/(2*a)+"\n"+(double)(-b-sqrt_val)/(2*a));
        }

        else if(d==0)
        {
            dta1.append("Roots are the same"+"\n");
            dta1.append(-b/(2*a)+"\n"+-b/(2*a));
        }
        else   //(d<0)
        {
          dta1.append("Roots are complex"+"\n\n");
          dta1.append(-(double)b/(2*a)+" +i"+sqrt_val+"\n"+-(double)b/(2*a)+" -i"+sqrt_val);          
        }
    }
    
    static void findDifference(String startdate, String enddate){
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date d1 = sdf.parse(startdate);
            Date d2 = sdf.parse(enddate);

            long difference = d2.getTime()-d1.getTime();
            long diff_years=(difference/(1000*60*60*24*365))/22;
            long diff_days=(difference/(1000*60*60*24))%365;
            
            JOptionPane.showMessageDialog(null, "The duration between the two entered dates are: "
                    + diff_years+" years "+diff_days+" days.", "RESULTS", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }
    
    static void ageCalculator(int a,String dob, String today){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try{
            Date d1 = sdf.parse(dob);
            Date d2 = sdf.parse(today);

            long difference = d2.getTime()-d1.getTime();
            long diff_years=(difference/(1000*60*60*24*365))/22;
            long diff_days=(difference/(1000*60*60*24))%365;
            
            JOptionPane.showMessageDialog(null, "Your Age Is: " + diff_years+" years "
                                      +diff_days+" days.", "RESULTS", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
    }

    private void sciCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sciCalcBActionPerformed
         cl.show(getContentPane(), "cardSciCalc");
    }//GEN-LAST:event_sciCalcBActionPerformed

    private void bmiCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmiCalcBActionPerformed
        cl.show(getContentPane(), "cardBMICalc");
    }//GEN-LAST:event_bmiCalcBActionPerformed

    private void dateCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateCalcBActionPerformed
        cl.show(getContentPane(), "cardDateDiffCalc");
    }//GEN-LAST:event_dateCalcBActionPerformed

    private void ageCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageCalcBActionPerformed
        cl.show(getContentPane(), "cardAgeCalc");
    }//GEN-LAST:event_ageCalcBActionPerformed

    private void perCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perCalcBActionPerformed
        cl.show(getContentPane(), "cardPercentageCalc");
    }//GEN-LAST:event_perCalcBActionPerformed

    private void disCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disCalcBActionPerformed
        cl.show(getContentPane(), "cardDiscountCalc");
    }//GEN-LAST:event_disCalcBActionPerformed

    private void quadCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadCalcBActionPerformed
        cl.show(getContentPane(), "cardQuadEqnsCalc");
    }//GEN-LAST:event_quadCalcBActionPerformed

    private void lengthConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthConvCalcBActionPerformed
        cl.show(getContentPane(), "cardLengthConvCalc");
    }//GEN-LAST:event_lengthConvCalcBActionPerformed

    private void areaConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaConvCalcBActionPerformed
        cl.show(getContentPane(), "cardAreaConvCalc");
    }//GEN-LAST:event_areaConvCalcBActionPerformed

    private void volConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volConvCalcBActionPerformed
        cl.show(getContentPane(), "cardVolumeConvCalc");
    }//GEN-LAST:event_volConvCalcBActionPerformed

    private void spdConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spdConvCalcBActionPerformed
       cl.show(getContentPane(), "cardSpeedConvCalc");
    }//GEN-LAST:event_spdConvCalcBActionPerformed

    private void timeConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeConvCalcBActionPerformed
        cl.show(getContentPane(), "cardTimeConvCalc");
    }//GEN-LAST:event_timeConvCalcBActionPerformed

    private void massConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massConvCalcBActionPerformed
        cl.show(getContentPane(), "cardMassConvCalc");
    }//GEN-LAST:event_massConvCalcBActionPerformed

    private void numSysConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSysConvCalcBActionPerformed
        cl.show(getContentPane(), "cardNumSysConvCalc");
    }//GEN-LAST:event_numSysConvCalcBActionPerformed

    private void tempConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempConvCalcBActionPerformed
        cl.show(getContentPane(), "cardTemperatureConvCalc");
    }//GEN-LAST:event_tempConvCalcBActionPerformed

    private void storageSizeConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageSizeConvCalcBActionPerformed
        cl.show(getContentPane(), "cardStorageSizeConvCalc");
    }//GEN-LAST:event_storageSizeConvCalcBActionPerformed

    private void investCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investCalcBActionPerformed
        cl.show(getContentPane(), "cardInvestmentCalc");
    }//GEN-LAST:event_investCalcBActionPerformed

    private void currencyConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConvCalcBActionPerformed
       cl.show(getContentPane(), "cardCurrencyConvCalc");
    }//GEN-LAST:event_currencyConvCalcBActionPerformed

    private void splitBillCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitBillCalcBActionPerformed
       cl.show(getContentPane(), "cardSplitBillCalc");
    }//GEN-LAST:event_splitBillCalcBActionPerformed

    private void loanCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCalcBActionPerformed
        cl.show(getContentPane(), "cardLoanCalc");
    }//GEN-LAST:event_loanCalcBActionPerformed

    private void HomeExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeExitBActionPerformed
        System.exit(0);
    }//GEN-LAST:event_HomeExitBActionPerformed

    private void SciCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SciCalcBackBActionPerformed
         cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_SciCalcBackBActionPerformed

    private void BMICalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMICalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_BMICalcBackBActionPerformed

    private void DateDiffBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateDiffBackBActionPerformed
      cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_DateDiffBackBActionPerformed

    private void PerCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerCalcBackBActionPerformed
      cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_PerCalcBackBActionPerformed

    private void DisCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisCalcBackBActionPerformed
     cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_DisCalcBackBActionPerformed

    private void QuadEqnBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadEqnBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_QuadEqnBackBActionPerformed

    private void GSTCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSTCalcBActionPerformed
        cl.show(getContentPane(), "cardGSTCalc");
    }//GEN-LAST:event_GSTCalcBActionPerformed

    private void LengthConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_LengthConvCalcBackBActionPerformed

    private void AreaConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_AreaConvCalcBackBActionPerformed

    private void VolumeConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumeConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_VolumeConvCalcBackBActionPerformed

    private void SpeedConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpeedConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_SpeedConvCalcBackBActionPerformed

    private void TimeConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_TimeConvCalcBackBActionPerformed

    private void MassConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MassConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_MassConvCalcBackBActionPerformed

    private void NumSysConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumSysConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_NumSysConvCalcBackBActionPerformed

    private void TempConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_TempConvCalcBackBActionPerformed

    private void StorageSizeConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StorageSizeConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_StorageSizeConvCalcBackBActionPerformed

    private void InvestmentCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvestmentCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_InvestmentCalcBackBActionPerformed

    private void CurrencyConvCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrencyConvCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_CurrencyConvCalcBackBActionPerformed

    private void SplitBillCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SplitBillCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_SplitBillCalcBackBActionPerformed

    private void LoanCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_LoanCalcBackBActionPerformed

    private void GSTCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GSTCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_GSTCalcBackBActionPerformed

    private void quadEqncmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadEqncmb1ActionPerformed
        fs=quadEqncmb1.getSelectedIndex();
        if(fs==0)
            fd='+';
        else
            fd='-';
    }//GEN-LAST:event_quadEqncmb1ActionPerformed

    private void quadEqnscmb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadEqnscmb2ActionPerformed
        ms=quadEqnscmb2.getSelectedIndex();
        if(ms==0)
            md='+';
        else
            md='-';
    }//GEN-LAST:event_quadEqnscmb2ActionPerformed

    private void quadEqnscmb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quadEqnscmb3ActionPerformed
       ls=quadEqnscmb3.getSelectedIndex();
       if(ls==0)
           ld='+';
       else
           ld='-';
    }//GEN-LAST:event_quadEqnscmb3ActionPerformed

    private void QuadEqnShowBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuadEqnShowBActionPerformed
       discriminantShow();
    }//GEN-LAST:event_QuadEqnShowBActionPerformed

    private void currencyConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConvCMB1ActionPerformed
        cconvcmb1=currencyConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_currencyConvCMB1ActionPerformed

    private void currencyConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConvCMB2ActionPerformed
        cconvcmb2=currencyConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_currencyConvCMB2ActionPerformed

    private void currencyConvCalculateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currencyConvCalculateBActionPerformed

        currencyamt=Float.parseFloat(currencyConvL1.getText());

        if(cconvcmb1==cconvcmb2)              //<self> to <self>
            finalamt=currencyamt*1;

        else if(cconvcmb1==0&&cconvcmb2==1)  //aed to eur
            finalamt=currencyamt*0.2255f;
        else if(cconvcmb1==0&&cconvcmb2==2) //aed to gbp
            finalamt=currencyamt*0.2004f;
        else if(cconvcmb1==0&&cconvcmb2==3) //aed to inr
            finalamt=currencyamt*19.9106f;
        else if(cconvcmb1==0&&cconvcmb2==4) //aed to jpy
            finalamt=currencyamt*28.27f;
        else if(cconvcmb1==0&&cconvcmb2==5) //aed to usd
            finalamt=currencyamt*0.2723f;

        else if(cconvcmb1==1&&cconvcmb2==0) //eur to aed
            finalamt=currencyamt*4.4352f;
        else if(cconvcmb1==1&&cconvcmb2==2) //eur to gbp
            finalamt=currencyamt*0.8891f;
        else if(cconvcmb1==1&&cconvcmb2==3) //eur to inr
            finalamt=currencyamt*88.49f;
        else if(cconvcmb1==1&&cconvcmb2==4) //eur to jpy
            finalamt=currencyamt*125.49f;
        else if(cconvcmb1==1&&cconvcmb2==5) //eur to usd
            finalamt=currencyamt*1.2075f;
        
        else if(cconvcmb1==2&&cconvcmb2==0) //gbp to aed
            finalamt=currencyamt*4.9912f;
        else if(cconvcmb1==2&&cconvcmb2==1) //gbp to eur
            finalamt=currencyamt*1.1249f;
        else if(cconvcmb1==2&&cconvcmb2==3) //gbp to inr
            finalamt=currencyamt*99.373f;
        else if(cconvcmb1==2&&cconvcmb2==4) //gbp to jpy
            finalamt=currencyamt*141.20f;
        else if(cconvcmb1==2&&cconvcmb2==5) //gbp to usd
            finalamt=currencyamt*1.3589f;
        
        else if(cconvcmb1==3&&cconvcmb2==0) //inr to aed
            finalamt=currencyamt*0.0502f;
        else if(cconvcmb1==3&&cconvcmb2==1) //inr to eur
            finalamt=currencyamt*0.0113f;
        else if(cconvcmb1==3&&cconvcmb2==2) //inr to gbp
            finalamt=currencyamt*0.0101f;
        else if(cconvcmb1==3&&cconvcmb2==4) //inr to jpy
            finalamt=currencyamt*1.42f;
        else if(cconvcmb1==3&&cconvcmb2==5) //inr to usd
            finalamt=currencyamt*0.0137f;
        
        else if(cconvcmb1==4&&cconvcmb2==0) //jpy to aed
            finalamt=currencyamt*0.035f;
        else if(cconvcmb1==4&&cconvcmb2==1) //jpy to eur
            finalamt=currencyamt*0.0080f;
        else if(cconvcmb1==4&&cconvcmb2==2) //jpy to gbp
            finalamt=currencyamt*0.0071f;
        else if(cconvcmb1==4&&cconvcmb2==3) //jpy to inr
            finalamt=currencyamt*0.70f;
        else if(cconvcmb1==4&&cconvcmb2==5) //jpy to usd
            finalamt=currencyamt*0.0096f;
       
        else if(cconvcmb1==5&&cconvcmb2==0) //usd to aed
            finalamt=currencyamt*3.673f;
        else if(cconvcmb1==5&&cconvcmb2==1) //usd to eur
            finalamt=currencyamt*0.8281f;
        else if(cconvcmb1==5&&cconvcmb2==2) //usd to gbp
            finalamt=currencyamt*0.7359f;
        else if(cconvcmb1==5&&cconvcmb2==3) //usd to inr
            finalamt=currencyamt*73.13f;
        else if(cconvcmb1==5&&cconvcmb2==4)  //usd to jpy
            finalamt=currencyamt*103.84f;
        
        JOptionPane.showMessageDialog(null,"Your "+currencyamt+" in OLD CURRENCY is "+finalamt+" in NEW CURRENCY",
                "Results", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_currencyConvCalculateBActionPerformed

    private void pnlSplitBillCalcMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSplitBillCalcMouseEntered

       // TODO add your handling code here:

    }//GEN-LAST:event_pnlSplitBillCalcMouseEntered

    private void pnlHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlHomeMouseEntered

         // TODO add your handling code here:

    }//GEN-LAST:event_pnlHomeMouseEntered

    private void splitBillCalcCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_splitBillCalcCalcBActionPerformed
        amt=(Float.parseFloat(amtSplitBillCalcT1.getText()));
        nppl=(Integer.parseInt(pplSplitBillCalcT2.getText()));
        splitamtSplitBillCalcT1.setText((amt/nppl)+"");
    }//GEN-LAST:event_splitBillCalcCalcBActionPerformed

    private void loanCalcCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanCalcCalcBActionPerformed
        int n=(fy*12)+my;
        loanamt=(Float.parseFloat(amtLoanCalcT1.getText()));
        interest=(Float.parseFloat(interestLoanCalcT2.getText()));
        interest=interest/(12*100); /*one month interest*/
        emi=(loanamt*interest*Math.pow(1+interest,n))/(Math.pow(1+interest,n)-1);
        femi = Float.parseFloat(String.format("%.2f", emi));
        ttlpym = Math.round(femi * n);
        femi = Math.round(femi);
        if(fy==30&&my>=1) {
            JOptionPane.showMessageDialog(null,"You Cannot Have Loan More Than \"30 Years\". Try Again", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(fy==0&&my==0) {
            JOptionPane.showMessageDialog(null,"You Can't Take The Loan As You Have Not Entered \"Loan Tenure\". Try Again", 
                    "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(fy==0&&my==1) {
            JOptionPane.showMessageDialog(null, "             EMI      \n" + "    "
                                         + fy+"  Year "+ my +" Month\n"
                                          + "      "+(loanamt+loanamt*interest*n/1200)+"      \n"
                                           + "----------------------------\n"
                                            +"      Total Payment(Principal+Interest)     \n"
                                             +"        "+(loanamt+loanamt*interest*n/1200)+" \n", "RESULTS", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "             EMI      \n" + "    "
                                         + fy+"  Year "+ my +" Month\n"
                                          + "         "+(femi)+"      \n"
                                           + "----------------------------\n"
                                            + "      Total Interest: "+(ttlpym-loanamt)+"\n"
                                             +"      Total Payment     \n"
                                              +"          "+ttlpym+" \n", "RESULTS", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loanCalcCalcBActionPerformed

    private void yearsLoanCalcCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsLoanCalcCMB1ActionPerformed
        fy=yearsLoanCalcCMB1.getSelectedIndex();
    }//GEN-LAST:event_yearsLoanCalcCMB1ActionPerformed

    private void monthLoanCalcCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthLoanCalcCMB2ActionPerformed
        my=monthLoanCalcCMB2.getSelectedIndex();
    }//GEN-LAST:event_monthLoanCalcCMB2ActionPerformed

    private void gstCalcCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstCalcCalcBActionPerformed

       gstamt=Float.parseFloat(gstCalcT1.getText());

       if(gstCalcR1.isSelected())
          sgst_cgst=(float)0.03*gstamt;
       else if(gstCalcR2.isSelected())
          sgst_cgst=(float)0.05*gstamt;
       else if(gstCalcR3.isSelected())
          sgst_cgst=(float)0.12*gstamt;
       else if(gstCalcR4.isSelected())
          sgst_cgst=(float)0.18*gstamt;
       else if(gstCalcR5.isSelected())
          sgst_cgst=(float)0.28*gstamt;

       JOptionPane.showMessageDialog(null, " Final Price     :            "+(gstamt+sgst_cgst+"\n")
                                         + " SGST/CGST  :            "+(sgst_cgst/2) , "RESULTS" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_gstCalcCalcBActionPerformed

    private void investmentCalcCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investmentCalcCMB1ActionPerformed
        investmentcmb1=investmentCalcCMB1.getSelectedIndex();
    }//GEN-LAST:event_investmentCalcCMB1ActionPerformed

    private void investmentCalcCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investmentCalcCMB2ActionPerformed
        investmentcmb2=investmentCalcCMB2.getSelectedIndex();
    }//GEN-LAST:event_investmentCalcCMB2ActionPerformed

    private void investmentCalcCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investmentCalcCalcBActionPerformed
        invest=Float.parseFloat(investmentCalcT1.getText());
        r=Float.parseFloat(investmentCalcT2.getText());
    }//GEN-LAST:event_investmentCalcCalcBActionPerformed

    private void lengthConvCalcCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthConvCalcCalcBActionPerformed
        length=Float.parseFloat(lengthConvCalcT1.getText());
        
        if(lengthconvcmb1==lengthconvcmb2) //Same Unit To Same Conversion
            finallength=length;

        else if(lengthconvcmb1==0&&lengthconvcmb2==1) //km to m
            finallength=length*Math.pow(10,3);                    
        else if(lengthconvcmb1==0&&lengthconvcmb2==2) //km to dm
            finallength=length*Math.pow(10,4);                                
        else if(lengthconvcmb1==0&&lengthconvcmb2==3) //km to cm
            finallength=length*Math.pow(10,5);
        else if(lengthconvcmb1==0&&lengthconvcmb2==4) //km to mm
            finallength=length*Math.pow(10,6);
        else if(lengthconvcmb1==0&&lengthconvcmb2==5) //km to um
            finallength=length*Math.pow(10,9);
        else if(lengthconvcmb1==0&&lengthconvcmb2==6) //km to nm
            finallength=length*Math.pow(10,12);
        else if(lengthconvcmb1==0&&lengthconvcmb2==7) //km to pm
            finallength=length*Math.pow(10,15);
        else if(lengthconvcmb1==0&&lengthconvcmb2==8) //km to nmi
            finallength=length*0.539956803;
        else if(lengthconvcmb1==0&&lengthconvcmb2==9) //km to mi
            finallength=length*0.621371192;
        else if(lengthconvcmb1==0&&lengthconvcmb2==10) //km to yd
            finallength=length*1093.6133;
        else if(lengthconvcmb1==0&&lengthconvcmb2==11) //km to ft
            finallength=length*3280.8399;
        else if(lengthconvcmb1==0&&lengthconvcmb2==12) //km to in
            finallength=length*39370.0787;
        else if(lengthconvcmb1==0&&lengthconvcmb2==13) //km to pc
            finallength=length*3.24077929*Math.pow(10,-14);
        else if(lengthconvcmb1==0&&lengthconvcmb2==14) //km to ld
            finallength=length*2.60145005*Math.pow(10,-6);
        else if(lengthconvcmb1==0&&lengthconvcmb2==15) //km to au
            finallength=length*6.68458712*Math.pow(10,-9);
        else if(lengthconvcmb1==0&&lengthconvcmb2==16) //km to ly
            finallength=length*1.05700083*Math.pow(10,-13);
       
        else if(lengthconvcmb1==1&&lengthconvcmb2==0) //m to km
            finallength=length*Math.pow(10,-3);
        else if(lengthconvcmb1==1&&lengthconvcmb2==2) //m to dm
            finallength=length*Math.pow(10,1);
        else if(lengthconvcmb1==1&&lengthconvcmb2==3) //m to cm
            finallength=length*Math.pow(10,2);
        else if(lengthconvcmb1==1&&lengthconvcmb2==4) //m to mm
            finallength=length*Math.pow(10,3);
        else if(lengthconvcmb1==1&&lengthconvcmb2==5) //m to um
            finallength=length*Math.pow(10,6);
        else if(lengthconvcmb1==1&&lengthconvcmb2==6) //m to nm
            finallength=length*Math.pow(10,9);
        else if(lengthconvcmb1==1&&lengthconvcmb2==7) //m to pm
            finallength=length*Math.pow(10,12);
        else if(lengthconvcmb1==1&&lengthconvcmb2==8) //m to nmi
            finallength=length*0.000539956803;
        else if(lengthconvcmb1==1&&lengthconvcmb2==9) //m to mi
            finallength=length*0.000621371192;
        else if(lengthconvcmb1==1&&lengthconvcmb2==10) //m to yd
            finallength=length*1.0936133;
        else if(lengthconvcmb1==1&&lengthconvcmb2==11) //m to ft
            finallength=length*3.2808399;
        else if(lengthconvcmb1==1&&lengthconvcmb2==12) //m to in
            finallength=length*39.3700787;
        else if(lengthconvcmb1==1&&lengthconvcmb2==13) //m to pc
            finallength=length*3.24077929*Math.pow(10,-17);
        else if(lengthconvcmb1==1&&lengthconvcmb2==14) //m to ld
            finallength=length*2.6145005*Math.pow(10,-9);
        else if(lengthconvcmb1==1&&lengthconvcmb2==15) //m to au
            finallength=length*6.68458712*Math.pow(10,-12);
        else if(lengthconvcmb1==1&&lengthconvcmb2==16) //m to ly
            finallength=length*1.05700083*Math.pow(10,-16);
       
        else if(lengthconvcmb1==2&&lengthconvcmb2==0) //dm to km
            finallength=length*Math.pow(10,-4);
        else if(lengthconvcmb1==2&&lengthconvcmb2==1) //dm to m
            finallength=length*Math.pow(10,-1);
        else if(lengthconvcmb1==2&&lengthconvcmb2==3) //dm to cm
            finallength=length*Math.pow(10,1);
        else if(lengthconvcmb1==2&&lengthconvcmb2==4) //dm to mm
            finallength=length*Math.pow(10,2);
        else if(lengthconvcmb1==2&&lengthconvcmb2==5) //dm to um
            finallength=length*Math.pow(10,5);
        else if(lengthconvcmb1==2&&lengthconvcmb2==6) //dm to nm
            finallength=length*Math.pow(10,8);
        else if(lengthconvcmb1==2&&lengthconvcmb2==7) //dm to pm
            finallength=length*Math.pow(10,11);
        else if(lengthconvcmb1==2&&lengthconvcmb2==8) //dm to nmi
            finallength=length*5.39956803*Math.pow(10,-5);
        else if(lengthconvcmb1==2&&lengthconvcmb2==9) //dm to mi
            finallength=length*6.21371192*Math.pow(10,-5);
        else if(lengthconvcmb1==2&&lengthconvcmb2==10) //dm to yd
            finallength=length*0.10936133;
        else if(lengthconvcmb1==2&&lengthconvcmb2==11) //dm to ft
            finallength=length*0.32808399;
        else if(lengthconvcmb1==2&&lengthconvcmb2==12) //dm to in
            finallength=length*3.93700787;
        else if(lengthconvcmb1==2&&lengthconvcmb2==13) //dm to pc
            finallength=length*3.24077929*Math.pow(10,-18);
        else if(lengthconvcmb1==2&&lengthconvcmb2==14) //dm to ld
            finallength=length*2.60145005*Math.pow(10,-10);
        else if(lengthconvcmb1==2&&lengthconvcmb2==15) //dm to au
            finallength=length*6.68458712*Math.pow(10,-13);
        else if(lengthconvcmb1==2&&lengthconvcmb2==16) //dm to ly
            finallength=length*1.05700083*Math.pow(10,-17);
        
        else if(lengthconvcmb1==3&&lengthconvcmb2==0) //cm to km
            finallength=length*Math.pow(10,-5);
        else if(lengthconvcmb1==3&&lengthconvcmb2==1) //cm to m
            finallength=length*Math.pow(10,-2);
        else if(lengthconvcmb1==3&&lengthconvcmb2==2) //cm to dm
            finallength=length*Math.pow(10,-1);
        else if(lengthconvcmb1==3&&lengthconvcmb2==4) //cm to mm
            finallength=length*Math.pow(10,1);
        else if(lengthconvcmb1==3&&lengthconvcmb2==5) //cm to um
            finallength=length*Math.pow(10,4);
        else if(lengthconvcmb1==3&&lengthconvcmb2==6) //cm to nm
            finallength=length*Math.pow(10,7);
        else if(lengthconvcmb1==3&&lengthconvcmb2==7) //cm to pm
            finallength=length*Math.pow(10,10);
        else if(lengthconvcmb1==3&&lengthconvcmb2==8) //cm to nmi
            finallength=length*5.39956803*Math.pow(10,-6);
        else if(lengthconvcmb1==3&&lengthconvcmb2==9) //cm to mi
            finallength=length*6.21371192*Math.pow(10,-6);
        else if(lengthconvcmb1==3&&lengthconvcmb2==10) //cm to yd
            finallength=length*0.010936133;
        else if(lengthconvcmb1==3&&lengthconvcmb2==11) //cm to ft
            finallength=length*0.032808399;
        else if(lengthconvcmb1==3&&lengthconvcmb2==12) //cm to in
            finallength=length*0.393700787;
        else if(lengthconvcmb1==3&&lengthconvcmb2==13) //cm to pc
            finallength=length*3.24077929*Math.pow(10,-19);
        else if(lengthconvcmb1==3&&lengthconvcmb2==14) //cm to ld
            finallength=length*2.60145005*Math.pow(10,-11);
        else if(lengthconvcmb1==3&&lengthconvcmb2==15) //cm to au
            finallength=length*6.68458712*Math.pow(10,-14);
        else if(lengthconvcmb1==3&&lengthconvcmb2==16) //cm to ly
            finallength=length*1.05700083*Math.pow(10,-18);
         
        else if(lengthconvcmb1==4&&lengthconvcmb2==0) //mm to km
            finallength=length*Math.pow(10,-6);
        else if(lengthconvcmb1==4&&lengthconvcmb2==1) //mm to m
            finallength=Math.pow(10,-3);
        else if(lengthconvcmb1==4&&lengthconvcmb2==2) //mm to dm
            finallength=length*Math.pow(10,-2);
        else if(lengthconvcmb1==4&&lengthconvcmb2==3) //mm to cm  
            finallength=length*Math.pow(10,-1);
        else if(lengthconvcmb1==4&&lengthconvcmb2==5) //mm to um
            finallength=length*Math.pow(10,3);
        else if(lengthconvcmb1==4&&lengthconvcmb2==6) //mm to nm
            finallength=length*Math.pow(10,6);
        else if(lengthconvcmb1==4&&lengthconvcmb2==7) //mm to pm
            finallength=length*Math.pow(10,9);
        else if(lengthconvcmb1==4&&lengthconvcmb2==8) //mm to nmi
            finallength=length*5.39956803;
        else if(lengthconvcmb1==4&&lengthconvcmb2==9) //mm to mi
            finallength=length*6.21371192;
        else if(lengthconvcmb1==4&&lengthconvcmb2==10) //mm to yd
            finallength=length*0.0010936133;
        else if(lengthconvcmb1==4&&lengthconvcmb2==11) //mm to ft
            finallength=length*0.0032808399;
        else if(lengthconvcmb1==4&&lengthconvcmb2==12) //mm to in
            finallength=length*0.0393700787;
        else if(lengthconvcmb1==4&&lengthconvcmb2==13) //mm to pc
            finallength=length*3.24077929*Math.pow(10,-20);
        else if(lengthconvcmb1==4&&lengthconvcmb2==14) //mm to ld
            finallength=length*2.60145005*Math.pow(10,-12);
        else if(lengthconvcmb1==4&&lengthconvcmb2==15) //mm to au
            finallength=length*6.68458712*Math.pow(10,-15);
        else if(lengthconvcmb1==4&&lengthconvcmb2==16) //mm to ly
            finallength=length*1.05700083*Math.pow(0,-19);
        
        else if(lengthconvcmb1==5&&lengthconvcmb2==0) //um to km
            finallength=length*Math.pow(10,-9);
        else if(lengthconvcmb1==5&&lengthconvcmb2==1) //um to m
            finallength=length*Math.pow(10,-6);
        else if(lengthconvcmb1==5&&lengthconvcmb2==2) //um to dm
            finallength=length*Math.pow(10,-5);
        else if(lengthconvcmb1==5&&lengthconvcmb2==3) //um to cm
            finallength=length*Math.pow(10,-4);
        else if(lengthconvcmb1==5&&lengthconvcmb2==4) //um to mm
            finallength=length*Math.pow(10,-3);
        else if(lengthconvcmb1==5&&lengthconvcmb2==6) //um to nm
            finallength=length*Math.pow(10,3);
        else if(lengthconvcmb1==5&&lengthconvcmb2==7) //um to pm
            finallength=length*Math.pow(10,6);
        else if(lengthconvcmb1==5&&lengthconvcmb2==8) //um to nmi
            finallength=length*5.39956803*Math.pow(10,-10);
        else if(lengthconvcmb1==5&&lengthconvcmb2==9) //umto mi
            finallength=length*6.21371192*Math.pow(10,-10);
        else if(lengthconvcmb1==5&&lengthconvcmb2==10) //um to yd
            finallength=length*1.0936133*Math.pow(10,-6);
        else if(lengthconvcmb1==5&&lengthconvcmb2==11) //um to ft
            finallength=length*3.2808399*Math.pow(10,-6);
        else if(lengthconvcmb1==5&&lengthconvcmb2==12) //um to in
            finallength=length*0.0393700787*Math.pow(10,-5);
        else if(lengthconvcmb1==5&&lengthconvcmb2==13) //um to pc
            finallength=length*3.24077929*Math.pow(10,-23);
        else if(lengthconvcmb1==5&&lengthconvcmb2==14) //um to ld
            finallength=length*2.60145005*Math.pow(10,-15);
        else if(lengthconvcmb1==5&&lengthconvcmb2==15) //um to au
            finallength=length*6.68458712*Math.pow(10,-18);
        else if(lengthconvcmb1==5&&lengthconvcmb2==16) //um to ly
            finallength=length*1.05700083*Math.pow(10,-22);
         
        else if(lengthconvcmb1==6&&lengthconvcmb2==0) //nm to km
            finallength=length*Math.pow(10,-12);
        else if(lengthconvcmb1==6&&lengthconvcmb2==1) //nm to m                    
            finallength=length*Math.pow(10,-9);
        else if(lengthconvcmb1==6&&lengthconvcmb2==2) //nm to dm
            finallength=length*Math.pow(10,-8);
        else if(lengthconvcmb1==6&&lengthconvcmb2==3) //nm to cm
            finallength=length*Math.pow(10,-7);
        else if(lengthconvcmb1==6&&lengthconvcmb2==4) //nm to mm
            finallength=length*Math.pow(10,-6);
        else if(lengthconvcmb1==6&&lengthconvcmb2==5) //nm to um
            finallength=length*Math.pow(10,-3);
        else if(lengthconvcmb1==6&&lengthconvcmb2==7) //nm to pm
            finallength=length*Math.pow(10,3);
        else if(lengthconvcmb1==6&&lengthconvcmb2==8) //nm to nmi
            finallength=length*5.39956803*Math.pow(10,-13);
        else if(lengthconvcmb1==6&&lengthconvcmb2==9) //nm to mi
            finallength=length*6.21371192*Math.pow(10,-13);
        else if(lengthconvcmb1==6&&lengthconvcmb2==10) //nm to yd
            finallength=length*1.0936133*Math.pow(10,-9);
        else if(lengthconvcmb1==6&&lengthconvcmb2==11) //nm to ft
            finallength=length*3.2808399*Math.pow(10,-9);
        else if(lengthconvcmb1==6&&lengthconvcmb2==12) //nm to in
            finallength=length*0.0393700787*Math.pow(10,-8);
        else if(lengthconvcmb1==6&&lengthconvcmb2==13) //nm to pc
            finallength=length*3.24077929*Math.pow(10,-26);
        else if(lengthconvcmb1==6&&lengthconvcmb2==14) //nm to ld
            finallength=length*2.60145005*Math.pow(10,-18);
        else if(lengthconvcmb1==6&&lengthconvcmb2==15) //nm to au
            finallength=length*6.68458712*Math.pow(10,-21);
        else if(lengthconvcmb1==6&&lengthconvcmb2==16) //nm to ly
            finallength=length*1.05700083*Math.pow(10,-25);

        else if(lengthconvcmb1==7&&lengthconvcmb2==0) //pm to km
            finallength=length*Math.pow(10,-15);
        else if(lengthconvcmb1==7&&lengthconvcmb2==1) //pm to m
            finallength=length*Math.pow(10,-12);
        else if(lengthconvcmb1==7&&lengthconvcmb2==2) //pm to dm
            finallength=length*Math.pow(10,-11);
        else if(lengthconvcmb1==7&&lengthconvcmb2==3) //pm to cm
            finallength=length*Math.pow(10,-10);
        else if(lengthconvcmb1==7&&lengthconvcmb2==4) //pm to mm
            finallength=length*Math.pow(10,-9);
        else if(lengthconvcmb1==7&&lengthconvcmb2==5) //pm to um
            finallength=length*Math.pow(10,-6);
        else if(lengthconvcmb1==7&&lengthconvcmb2==6) //pm to nm
            finallength=length*Math.pow(10,-3);
        else if(lengthconvcmb1==7&&lengthconvcmb2==8) //pm to nmi
            finallength=length*5.39956803*Math.pow(10,-16);
        else if(lengthconvcmb1==7&&lengthconvcmb2==9) //pm to mi
            finallength=length*6.21371192*Math.pow(10,-16);
        else if(lengthconvcmb1==7&&lengthconvcmb2==10) //pm to yd
            finallength=length*1.0936133*Math.pow(10,-12);
        else if(lengthconvcmb1==7&&lengthconvcmb2==11) //pm to ft
            finallength=length*3.2808399*Math.pow(10,-12);
        else if(lengthconvcmb1==7&&lengthconvcmb2==12) //pm to in
            finallength=length*0.0393700787*Math.pow(10,-11);
        else if(lengthconvcmb1==7&&lengthconvcmb2==13) //pm to pc
            finallength=length*3.24077929*Math.pow(10,-29);
        else if(lengthconvcmb1==7&&lengthconvcmb2==14) //pm to ld
            finallength=length*2.60145005*Math.pow(10,-21);
        else if(lengthconvcmb1==7&&lengthconvcmb2==15) //pm to au
            finallength=length*6.68458712*Math.pow(10,-24);
        else if(lengthconvcmb1==7&&lengthconvcmb2==16) //pm to ly
            finallength=length*1.05700083*Math.pow(10,-28);
        
        else if(lengthconvcmb1==8&&lengthconvcmb2==0) //nmi to km
            finallength=length*1.852;
        else if(lengthconvcmb1==8&&lengthconvcmb2==1) //nmi to m
            finallength=length*1852;
        else if(lengthconvcmb1==8&&lengthconvcmb2==2) //nmi to dm
            finallength=length*18520;
        else if(lengthconvcmb1==8&&lengthconvcmb2==3) //nmi to cm
            finallength=length*1.852*Math.pow(10,5);
        else if(lengthconvcmb1==8&&lengthconvcmb2==4) //nmi to mm
            finallength=length*1.852*Math.pow(10,6);
        else if(lengthconvcmb1==8&&lengthconvcmb2==5) //nmi to um
            finallength=length*1.852*Math.pow(10,9);
        else if(lengthconvcmb1==8&&lengthconvcmb2==6) //nmi to nm
            finallength=length*1.852*Math.pow(10,12);
        else if(lengthconvcmb1==8&&lengthconvcmb2==7) //nmi to pm
            finallength=length*1.852*Math.pow(10,15);
        else if(lengthconvcmb1==8&&lengthconvcmb2==9) //nmi to mi
            finallength=length*1.15077945;
        else if(lengthconvcmb1==8&&lengthconvcmb2==10) //nmi to yd
            finallength=length*2025.37183;
        else if(lengthconvcmb1==8&&lengthconvcmb2==11) //nmi to ft
            finallength=length*6076.11549;
        else if(lengthconvcmb1==8&&lengthconvcmb2==12) //nmi to in
            finallength=length*72913.3858;
        else if(lengthconvcmb1==8&&lengthconvcmb2==13) //nmi to pc
            finallength=length*6.00192324*Math.pow(10,-14);
        else if(lengthconvcmb1==8&&lengthconvcmb2==14) //nmi to ld
            finallength=length*4.81788549*Math.pow(10,-6);
        else if(lengthconvcmb1==8&&lengthconvcmb2==15) //nmi to au
            finallength=length*1.23798554*Math.pow(10,-8);
        else if(lengthconvcmb1==8&&lengthconvcmb2==16) //nmi to ly
            finallength=length*1.99756554*Math.pow(10,-13);
        
        else if(lengthconvcmb1==9&&lengthconvcmb2==0) //mi to km
            finallength=length*1.609344;
        else if(lengthconvcmb1==9&&lengthconvcmb2==1) //mi to m
            finallength=length*1609.344;
        else if(lengthconvcmb1==9&&lengthconvcmb2==2) //mi to dm
            finallength=length*16093.44;
        else if(lengthconvcmb1==9&&lengthconvcmb2==3) //mi to cm
            finallength=length*160934.4;
        else if(lengthconvcmb1==9&&lengthconvcmb2==4) //mi to mm
            finallength=length*1609344;
        else if(lengthconvcmb1==9&&lengthconvcmb2==5) //mi to um
            finallength=length*1.609344*Math.pow(10,9);
        else if(lengthconvcmb1==9&&lengthconvcmb2==6) //mi to nm
            finallength=length*1.609344*Math.pow(10,12);
        else if(lengthconvcmb1==9&&lengthconvcmb2==7) //mi to pm
            finallength=length*1.609344*Math.pow(10,15);
        else if(lengthconvcmb1==9&&lengthconvcmb2==8) //mi to nmi
            finallength=length*0.868976242;
        else if(lengthconvcmb1==9&&lengthconvcmb2==10) //mi to yd
            finallength=length*1760;
        else if(lengthconvcmb1==9&&lengthconvcmb2==11) //mi to ft
            finallength=length*5280;
        else if(lengthconvcmb1==9&&lengthconvcmb2==12) //mi to in
            finallength=length*63360;
        else if(lengthconvcmb1==9&&lengthconvcmb2==13) //mi to pc
            finallength=length*5.2155287*Math.pow(10,-14);
        else if(lengthconvcmb1==9&&lengthconvcmb2==14) //mi to ld
            finallength=length*4.18662803*Math.pow(10,-6);
        else if(lengthconvcmb1==9&&lengthconvcmb2==15) //mi to au
            finallength=length*1.07578002*Math.pow(10,-8);
        else if(lengthconvcmb1==9&&lengthconvcmb2==16) //mi to ly
            finallength=length*1.70107795*Math.pow(10,-13);
        
        else if(lengthconvcmb1==10&&lengthconvcmb2==0) //yd to km
            finallength=length*0.0009144;
        else if(lengthconvcmb1==10&&lengthconvcmb2==1) //yd to m
            finallength=length*0.9144;
        else if(lengthconvcmb1==10&&lengthconvcmb2==2) //yd to dm
            finallength=length*9.144;
         else if(lengthconvcmb1==10&&lengthconvcmb2==3) //myd to cm
             finallength=length*91.44;
        else if(lengthconvcmb1==10&&lengthconvcmb2==4) //yd to mm
            finallength=length*914.4;
        else if(lengthconvcmb1==10&&lengthconvcmb2==5) //yd to um
            finallength=length*9.144*Math.pow(10,5);
        else if(lengthconvcmb1==10&&lengthconvcmb2==6) //yd to nm
            finallength=length*9.144*Math.pow(10,8);
        else if(lengthconvcmb1==10&&lengthconvcmb2==7) //yd to pm
            finallength=length*9.144*Math.pow(10,11);
        else if(lengthconvcmb1==10&&lengthconvcmb2==8) //yd to nmi
            finallength=length*0.000493736501;
        else if(lengthconvcmb1==10&&lengthconvcmb2==9) //yd to mi
            finallength=length*0.000568181818;
        else if(lengthconvcmb1==10&&lengthconvcmb2==11) //yd to ft
            finallength=length*3;
        else if(lengthconvcmb1==10&&lengthconvcmb2==12) //yd to in
            finallength=length*36;
        else if(lengthconvcmb1==10&&lengthconvcmb2==13) //yd to pc
            finallength=length*2.96336858*Math.pow(10,-17);
        else if(lengthconvcmb1==10&&lengthconvcmb2==14) //yd to ld
            finallength=length*2.37876592*Math.pow(10,-9);
        else if(lengthconvcmb1==10&&lengthconvcmb2==15) //yd to au
            finallength=length*6.11238646*Math.pow(10,-12);
        else if(lengthconvcmb1==10&&lengthconvcmb2==16) //yd to ly
            finallength=length*9.66521563*Math.pow(10,-17);
        
        else if(lengthconvcmb1==11&&lengthconvcmb2==0) //ft to km
            finallength=length*0.0003048;
        else if(lengthconvcmb1==11&&lengthconvcmb2==1) //ft to m
            finallength=length*0.3048;
        else if(lengthconvcmb1==11&&lengthconvcmb2==2) //ft to dm
            finallength=length*3.048;
        else if(lengthconvcmb1==11&&lengthconvcmb2==3) //ft to cm
            finallength=length*30.48;
        else if(lengthconvcmb1==11&&lengthconvcmb2==4) //ft to mm
            finallength=length*304.8;
        else if(lengthconvcmb1==11&&lengthconvcmb2==5) //ft to um
            finallength=length*3.048*Math.pow(10,5);
       else if(lengthconvcmb1==11&&lengthconvcmb2==6) //ft to nm
           finallength=length*3.048*Math.pow(10,8);
        else if(lengthconvcmb1==11&&lengthconvcmb2==7) //ft to pm
            finallength=length*3.048*Math.pow(10,11);
        else if(lengthconvcmb1==11&&lengthconvcmb2==8) //ft to nmi
            finallength=length*0.0001645578834;
        else if(lengthconvcmb1==11&&lengthconvcmb2==9) //ft to mi
            finallength=length*0.000189393939;
     else if(lengthconvcmb1==11&&lengthconvcmb2==10) //ft to yd
            finallength=length*0.333333333;
        else if(lengthconvcmb1==11&&lengthconvcmb2==12) //ft to in
            finallength=length*12;
        else if(lengthconvcmb1==11&&lengthconvcmb2==13) //ft to pc
            finallength=length*9.87789527*Math.pow(10,-18);
        else if(lengthconvcmb1==11&&lengthconvcmb2==14) //ft to ld
            finallength=length*7.9291975*Math.pow(10,-10);
        else if(lengthconvcmb1==11&&lengthconvcmb2==15) //ft to au
            finallength=length*2.30746215*Math.pow(10,-12);
        else if(lengthconvcmb1==11&&lengthconvcmb2==16) //ft to ly
            finallength=length*3.22173854*Math.pow(10,-17);
        
        else if(lengthconvcmb1==12&&lengthconvcmb2==0) //in to km
            finallength=length*2.54*Math.pow(10,-5);
        else if(lengthconvcmb1==12&&lengthconvcmb2==1) //in to m
            finallength=length*2.54*Math.pow(10,-2);
        else if(lengthconvcmb1==12&&lengthconvcmb2==2) //in to dm
            finallength=length*0.254;
        else if(lengthconvcmb1==12&&lengthconvcmb2==3) //in to cm
            finallength=length*2.54;
        else if(lengthconvcmb1==12&&lengthconvcmb2==4) //in to mm
            finallength=length*25.4;
        else if(lengthconvcmb1==12&&lengthconvcmb2==5) //in to um
            finallength=length*2.54*Math.pow(10,4);
        else if(lengthconvcmb1==12&&lengthconvcmb2==6) //in to nm
            finallength=length*2.54*Math.pow(10,7);
        else if(lengthconvcmb1==12&&lengthconvcmb2==7) //in to pm
            finallength=length*2.54*Math.pow(10,10);
        else if(lengthconvcmb1==12&&lengthconvcmb2==8) //in to nmi
            finallength=length*1.37149028*Math.pow(10,-5);
        else if(lengthconvcmb1==12&&lengthconvcmb2==9) //in to mi
            finallength=length*1.57828283*Math.pow(10,-5);
        else if(lengthconvcmb1==12&&lengthconvcmb2==10) //in to yd
            finallength=length*0.0277777778;
        else if(lengthconvcmb1==12&&lengthconvcmb2==11) //in to ft
            finallength=length*0.083333333;
        else if(lengthconvcmb1==12&&lengthconvcmb2==13) //in to pc
           finallength=length*8.2315794*Math.pow(10,-19);
        else if(lengthconvcmb1==12&&lengthconvcmb2==14) //in to ld
           finallength=length*6.60768312*Math.pow(10,-11);
        else if(lengthconvcmb1==12&&lengthconvcmb2==15) //in to au
            finallength=length*1.69788513*Math.pow(10,-13);
        else if(lengthconvcmb1==12&&lengthconvcmb2==16) //in to ly
            finallength=length*2.6847821*Math.pow(10,-18);
        
        else if(lengthconvcmb1==13&&lengthconvcmb2==0) //pc to km
            finallength=length*3.08567758*Math.pow(10,13);
        else if(lengthconvcmb1==13&&lengthconvcmb2==1) //pc to m
           finallength=length*3.08567758*Math.pow(10,16);
        else if(lengthconvcmb1==13&&lengthconvcmb2==2) //pc to dm
            finallength=length*3.08567758*Math.pow(10,17);
        else if(lengthconvcmb1==13&&lengthconvcmb2==3) //pc to cm
           finallength=length*3.08567758*Math.pow(10,18);
        else if(lengthconvcmb1==13&&lengthconvcmb2==4) //pc to mm
          finallength=length*3.08567758*Math.pow(10,19);
        else if(lengthconvcmb1==13&&lengthconvcmb2==5) //pc to um
           finallength=length*3.08567758*Math.pow(10,22);
        else if(lengthconvcmb1==13&&lengthconvcmb2==6) //pc to nm
            finallength=length*3.08567758*Math.pow(10,25);
        else if(lengthconvcmb1==13&&lengthconvcmb2==7) //pc to pm
            finallength=length*3.08567758*Math.pow(10,28);
        else if(lengthconvcmb1==13&&lengthconvcmb2==8) //pc to nmi
            finallength=length*1.661326*Math.pow(10,13);
        else if(lengthconvcmb1==13&&lengthconvcmb2==9) //pc to mi
            finallength=length*1.91735116*Math.pow(10,13);
        else if(lengthconvcmb1==13&&lengthconvcmb2==10) //pc to yd
            finallength=length*3.37453804*Math.pow(10,16);
        else if(lengthconvcmb1==13&&lengthconvcmb2==11) //pc to ft
            finallength=length*1.01236141*Math.pow(10,17);
        else if(lengthconvcmb1==13&&lengthconvcmb2==12) //pc to in
            finallength=length*1.21483369*Math.pow(10,18);
        else if(lengthconvcmb1==13&&lengthconvcmb2==14) //pc to ld
            finallength=length*80272360.9;
        else if(lengthconvcmb1==13&&lengthconvcmb2==15) //pc to au
            finallength=length*206264.806;
        else if(lengthconvcmb1==13&&lengthconvcmb2==16) //pc to ly
            finallength=length*3.26156378;
        
        else if(lengthconvcmb1==14&&lengthconvcmb2==0) //ld to km
            finallength=length*3.84401*Math.pow(10,5);
        else if(lengthconvcmb1==14&&lengthconvcmb2==1) //ld to m
            finallength=length*3.84401*Math.pow(10,8);
        else if(lengthconvcmb1==14&&lengthconvcmb2==2) //ld to dm
            finallength=length*3.84401*Math.pow(10,9);
        else if(lengthconvcmb1==14&&lengthconvcmb2==3) //ld to cm
            finallength=length*3.88401*Math.pow(10,10);
        else if(lengthconvcmb1==14&&lengthconvcmb2==4) //ld to mm
            finallength=length*3.84401*Math.pow(10,11);
        else if(lengthconvcmb1==14&&lengthconvcmb2==5) //ld to um
            finallength=length*3.84401*Math.pow(10,14);
        else if(lengthconvcmb1==14&&lengthconvcmb2==6) //ld to nm
            finallength=length*3.84401*Math.pow(10,17);
        else if(lengthconvcmb1==14&&lengthconvcmb2==7) //ld to pm
            finallength=length*3.84401*Math.pow(10,20);
        else if(lengthconvcmb1==14&&lengthconvcmb2==8) //ld to nmi
            finallength=length*2.07559935*Math.pow(10,5);
        else if(lengthconvcmb1==14&&lengthconvcmb2==9) //ld to mi
            finallength=length*2.38855708*Math.pow(10,5);
        else if(lengthconvcmb1==14&&lengthconvcmb2==10) //ld to yd
            finallength=length*4.20386045*Math.pow(10,8);
        else if(lengthconvcmb1==14&&lengthconvcmb2==11) //ld to ft
            finallength=length*1.26115814*Math.pow(10,9);
        else if(lengthconvcmb1==13&&lengthconvcmb2==12) //ld to in
            finallength=length*1.51338976*Math.pow(10,10);
        else if(lengthconvcmb1==14&&lengthconvcmb2==13) //ld to pc
            finallength=length*1.2457588*Math.pow(10,-8);
        else if(lengthconvcmb1==14&&lengthconvcmb2==15) //ld to au
            finallength=length*0.00256956197;
        else if(lengthconvcmb1==14&&lengthconvcmb2==16) //ld to ly
            finallength=length*4.06312178*Math.pow(10,-8);
         
        else if(lengthconvcmb1==15&&lengthconvcmb2==0) //au to km
            finallength=length*1.49597871*Math.pow(10,8);
        else if(lengthconvcmb1==15&&lengthconvcmb2==1) //au to m
            finallength=length*1.49597871*Math.pow(10,11);
        else if(lengthconvcmb1==15&&lengthconvcmb2==2) //au to dm
            finallength=length*1.49597871*Math.pow(10,12);
        else if(lengthconvcmb1==15&&lengthconvcmb2==3) //au to cm
            finallength=length*1.49597871*Math.pow(10,13);
        else if(lengthconvcmb1==15&&lengthconvcmb2==4) //au to mm
            finallength=length*1.49597871*Math.pow(10,14);
        else if(lengthconvcmb1==15&&lengthconvcmb2==5) //au to um
            finallength=length*1.49597871*Math.pow(10,17);
        else if(lengthconvcmb1==15&&lengthconvcmb2==6) //au to nm
            finallength=length*1.49597871*Math.pow(10,20);
        else if(lengthconvcmb1==15&&lengthconvcmb2==7) //au to pm
            finallength=length*1.49597871*Math.pow(10,23);
        else if(lengthconvcmb1==15&&lengthconvcmb2==8) //au to nmi
            finallength=length*8.0776388*Math.pow(10,7);
        else if(lengthconvcmb1==15&&lengthconvcmb2==9) //au to mi
            finallength=length*9.2955807*Math.pow(10,7);
        else if(lengthconvcmb1==15&&lengthconvcmb2==10) //au to yd
            finallength=length*1.63602221*Math.pow(10,11);
        else if(lengthconvcmb1==15&&lengthconvcmb2==11) //au to ft
            finallength=length*4.90806662*Math.pow(10,11);
        else if(lengthconvcmb1==15&&lengthconvcmb2==12) //au to in
            finallength=length*5.88967995*Math.pow(10,12);
        else if(lengthconvcmb1==15&&lengthconvcmb2==13) //au to pc
            finallength=length*4.84813681*Math.pow(10,-6);
        else if(lengthconvcmb1==15&&lengthconvcmb2==14) //au to ld
            finallength=length*389.171388;
        else if(lengthconvcmb1==15&&lengthconvcmb2==16) //au to ly
            finallength=length*1.58125074*Math.pow(10,-5);
        
        else if(lengthconvcmb1==16&&lengthconvcmb2==0) //ly to km
            finallength=length*9.40673047*Math.pow(10,12);
        else if(lengthconvcmb1==16&&lengthconvcmb2==1) //ly to m
            finallength=length*9.40673047*Math.pow(10,15);
        else if(lengthconvcmb1==16&&lengthconvcmb2==2) //ly to dm
            finallength=length*9.40673047*Math.pow(10,16);
        else if(lengthconvcmb1==16&&lengthconvcmb2==3) //ly to cm
            finallength=length*9.40673047*Math.pow(10,17);
        else if(lengthconvcmb1==16&&lengthconvcmb2==4) //ly to mm
            finallength=length*9.40673047*Math.pow(10,18);
        else if(lengthconvcmb1==16&&lengthconvcmb2==5) //ly to um
            finallength=length*9.40673047*Math.pow(10,21);
        else if(lengthconvcmb1==16&&lengthconvcmb2==6) //ly to nm
            finallength=length*9.40673047*Math.pow(10,24);
        else if(lengthconvcmb1==16&&lengthconvcmb2==7) //ly to pm
            finallength=length*9.40673047*Math.pow(10,27);
        else if(lengthconvcmb1==16&&lengthconvcmb2==8) //ly to nmi
            finallength=length*5.10838578*Math.pow(10,12);
        else if(lengthconvcmb1==16&&lengthconvcmb2==9) //ly to mi
            finallength=length*5.87862537*Math.pow(10,12);
        else if(lengthconvcmb1==16&&lengthconvcmb2==10) //ly to yd
            finallength=length*1.03463807*Math.pow(10,16);
        else if(lengthconvcmb1==16&&lengthconvcmb2==11) //ly to ft
            finallength=length*3.1039142*Math.pow(10,16);
        else if(lengthconvcmb1==16&&lengthconvcmb2==12) //ly to in
            finallength=length*3.72469704*Math.pow(10,17);
        else if(lengthconvcmb1==16&&lengthconvcmb2==13) //ly to pc
            finallength=length*0.306601394;
        else if(lengthconvcmb1==16&&lengthconvcmb2==14) //ly to ld
            finallength=length*24611617.7;
        else if(lengthconvcmb1==16&&lengthconvcmb2==15) //ly to au
            finallength=length*63241.0771;
        
        JOptionPane.showMessageDialog(null, " Your "+length+" "+lengthConvCMB1.getSelectedItem()+
                    " length is "+finallength+" "+lengthConvCMB2.getSelectedItem(), "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_lengthConvCalcCalcBActionPerformed

    private void lengthConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthConvCMB1ActionPerformed
        lengthconvcmb1=lengthConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_lengthConvCMB1ActionPerformed

    private void lengthConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthConvCMB2ActionPerformed
        lengthconvcmb2=lengthConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_lengthConvCMB2ActionPerformed

    private void AgeCalcBackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeCalcBackBActionPerformed
        cl.show(getContentPane(), "cardHome");
    }//GEN-LAST:event_AgeCalcBackBActionPerformed
   
    private void datedDiffCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datedDiffCalcBActionPerformed
        startdate=startdatel1.getText();
        enddate=enddatel2.getText();
        findDifference(startdate,enddate);
    }//GEN-LAST:event_datedDiffCalcBActionPerformed

    private void ageCalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageCalcButtonActionPerformed
        DOB=DOBl1.getText();
        LocalDate now = LocalDate.now();
        String dateStr = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        ageCalculator(0,DOB,dateStr);
    }//GEN-LAST:event_ageCalcButtonActionPerformed

    private void sizeConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeConvCMB1ActionPerformed
        sizeconvcmb1=sizeConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_sizeConvCMB1ActionPerformed

    private void sizeConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeConvCMB2ActionPerformed
        sizeconvcmb2=sizeConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_sizeConvCMB2ActionPerformed

    private void sizeConvCalcBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeConvCalcBActionPerformed

        double size = Double.parseDouble(sizeConvT1.getText());
       
        if (sizeconvcmb1==sizeconvcmb2)
            finalsize=size;
        
        else if (sizeconvcmb1==0&&sizeconvcmb2==1)
            finalsize=size*0.000976525;
        else if (sizeconvcmb1==0&&sizeconvcmb2==2)
            finalsize=size*9.53674316*Math.pow(10,-7);
        else if (sizeconvcmb1==0&&sizeconvcmb2==3)
            finalsize=size*9.31322575*Math.pow(10,-10);
        else if (sizeconvcmb1==0&&sizeconvcmb2==4)
            finalsize=size*9.09494702*Math.pow(10,-13);
        else if (sizeconvcmb1==0&&sizeconvcmb2==5)
            finalsize=size*8.8817842*Math.pow(10,-16);
         
        else if (sizeconvcmb1==1&&sizeconvcmb2==0)
            finalsize=size*1024;
        else if (sizeconvcmb1==1&&sizeconvcmb2==2)
            finalsize=size*0.000976525;
        else if (sizeconvcmb1==1&&sizeconvcmb2==3)
            finalsize=size*9.53674316*Math.pow(10,-7);
        else if (sizeconvcmb1==1&&sizeconvcmb2==4)
            finalsize=size*9.31322575*Math.pow(10,-10);
        else if (sizeconvcmb1==1&&sizeconvcmb2==5)
            finalsize=size*9.09494702*Math.pow(10,-13);
        
        else if (sizeconvcmb1==2&&sizeconvcmb2==0)
            finalsize=size*1048576;
        else if (sizeconvcmb1==2&&sizeconvcmb2==1)
            finalsize=size*1024;
        else if (sizeconvcmb1==2&&sizeconvcmb2==3)
            finalsize=size*0.00976525;
        else if (sizeconvcmb1==2&&sizeconvcmb2==4)
            finalsize=size*9.53674316*Math.pow(10,-7);
        else if (sizeconvcmb1==2&&sizeconvcmb2==5)
            finalsize=size*9.31322575*Math.pow(10,-10);
        
        else if (sizeconvcmb1==3&&sizeconvcmb2==0)
            finalsize=size*1.07374182*Math.pow(10,9);
        else if (sizeconvcmb1==3&&sizeconvcmb2==1)
            finalsize=size*1048576;
        else if (sizeconvcmb1==3&&sizeconvcmb2==2)
            finalsize=size*1024;
        else if (sizeconvcmb1==3&&sizeconvcmb2==4)
            finalsize=size*0.00976525;
        else if (sizeconvcmb1==3&&sizeconvcmb2==5)
            finalsize=size*9.53674316*Math.pow(10,-7);
         
        else if (sizeconvcmb1==4&&sizeconvcmb2==0)
            finalsize=size*1.09951163*Math.pow(10,12);
        else if (sizeconvcmb1==4&&sizeconvcmb2==1)
                finalsize=size*1.07374182*Math.pow(10,9);
        else if (sizeconvcmb1==4&&sizeconvcmb2==2)
            finalsize=size*1048576;
        else if (sizeconvcmb1==4&&sizeconvcmb2==3)
            finalsize=size*1024;
        else if (sizeconvcmb1==4&&sizeconvcmb2==5)
            finalsize=size*0.0009576525;
        
        else if (sizeconvcmb1==5&&sizeconvcmb2==0)
            finalsize=size*1.1258991*Math.pow(10,15);
        else if (sizeconvcmb1==5&&sizeconvcmb2==1)
                finalsize=size*1.09951163*Math.pow(10,12);
        else if (sizeconvcmb1==5&&sizeconvcmb2==2)
                finalsize=size*1.07374182*Math.pow(10,9);
        else if (sizeconvcmb1==5&&sizeconvcmb2==3)
            finalsize=size*1048576;
        else if (sizeconvcmb1==5&&sizeconvcmb2==4)
            finalsize=size*1024;
        
        JOptionPane.showMessageDialog(null, " Your "+size+" "+sizeConvCMB1.getSelectedItem()+
                    " size is "+finalsize+" "+sizeConvCMB2.getSelectedItem(), "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_sizeConvCalcBActionPerformed

    private void tempConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempConvCMB1ActionPerformed
        tempconvcmb1=tempConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_tempConvCMB1ActionPerformed

    private void tempConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempConvCMB2ActionPerformed
        tempconvcmb2=tempConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_tempConvCMB2ActionPerformed

    private void tempConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempConvCalcActionPerformed

        temp = Double.parseDouble(tempConvT1.getText());
        
        if (tempconvcmb1==tempconvcmb2)
            finaltemp=temp;
        
        else if (tempconvcmb1==0&&tempconvcmb2==1)
            finaltemp=(temp*9/5f)+32;
        else if (tempconvcmb1==0&&tempconvcmb2==2)
            finaltemp=temp+273.15;
        else if (tempconvcmb1==0&&tempconvcmb2==3)  
            finaltemp=(temp+273.15)*9/5f;
        else if (tempconvcmb1==0&&tempconvcmb2==4)
            finaltemp=temp*0.8;
              
        else if (tempconvcmb1==1&&tempconvcmb2==0)
            finaltemp=(temp-32)*5/9f;
        else if (tempconvcmb1==1&&tempconvcmb2==2)
            finaltemp=(temp-32)*5/9f+273.15;
        else if (tempconvcmb1==1&&tempconvcmb2==3)
            finaltemp=temp+459.67;
        else if (tempconvcmb1==1&&tempconvcmb2==4)
            finaltemp=(temp-32)*0.44444;
        
        else if (tempconvcmb1==2&&tempconvcmb2==0)
            finaltemp=temp-273.15;
        else if (tempconvcmb1==2&&tempconvcmb2==1)
                finaltemp=(temp-273.15)*9/5f+32;
        else if (tempconvcmb1==2&&tempconvcmb2==3)
                finaltemp=temp*1.8;
        else if (tempconvcmb1==2&&tempconvcmb2==4)
                finaltemp=(temp-273.15)*0.8;
         
       else if (tempconvcmb1==3&&tempconvcmb2==0)
           finaltemp=(temp-491.67)*5/9f;
        else if (tempconvcmb1==3&&tempconvcmb2==1)
            finaltemp=temp-459.67;
        else if (tempconvcmb1==3&&tempconvcmb2==2)
            finaltemp=temp*5/9f;
        else if (tempconvcmb1==3&&tempconvcmb2==4)
            finaltemp=(temp-491.67)*4/9;
          
        else if (tempconvcmb1==4&&tempconvcmb2==0)
            finaltemp=temp/0.8f;
        else if (tempconvcmb1==4&&tempconvcmb2==1)
            finaltemp=temp*9/4f+32;
        else if (tempconvcmb1==4&&tempconvcmb2==2)
            finaltemp=(temp/0.8f)+273.15;
        else if (tempconvcmb1==4&&tempconvcmb2==3)
            finaltemp=(temp*2.25)+491.67;
        
        JOptionPane.showMessageDialog(null, " Your "+temp+" "+ tempConvCMB1.getSelectedItem()+
                    " temperature is "+finaltemp+" "+ tempConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_tempConvCalcActionPerformed

    private void massConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massConvCMB1ActionPerformed
        massconvcmb1=massConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_massConvCMB1ActionPerformed

    private void massConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massConvCMB2ActionPerformed
        massconvcmb2=massConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_massConvCMB2ActionPerformed

    private void massConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_massConvCalcActionPerformed
        mass = Double.parseDouble(massConvCalcT1.getText());
        
        if(massconvcmb1==massconvcmb2)
            finalmass=mass;
        
        else if(massconvcmb1==0&&massconvcmb2==1)     //From Tonne t
            finalmass=1000*mass;
        else if(massconvcmb1==0&&massconvcmb2==2)
            finalmass=Math.pow(10,6)*mass;
        else if(massconvcmb1==0&&massconvcmb2==3)
            finalmass=Math.pow(10,9)*mass;
        else if(massconvcmb1==0&&massconvcmb2==4)
            finalmass=Math.pow(10,12)*mass;
        else if(massconvcmb1==0&&massconvcmb2==5)
            finalmass=10*mass;
        else if(massconvcmb1==0&&massconvcmb2==6)
            finalmass=2204.62262*mass;
        else if(massconvcmb1==0&&massconvcmb2==7)
            finalmass=3.52739619*Math.pow(10,4)*mass;
        else if(massconvcmb1==0&&massconvcmb2==8)
            finalmass=5*Math.pow(10,6)*mass;
      
        else if(massconvcmb1==1&&massconvcmb2==0)     //From Kilogram kg
            finalmass=0.001*mass;
        else if(massconvcmb1==1&&massconvcmb2==2)
            finalmass=Math.pow(10,3)*mass;
        else if(massconvcmb1==1&&massconvcmb2==3)
            finalmass=Math.pow(10,6)*mass;
        else if(massconvcmb1==1&&massconvcmb2==4)
            finalmass=Math.pow(10,9)*mass;
        else if(massconvcmb1==1&&massconvcmb2==5)
            finalmass=0.01*mass;
        else if(massconvcmb1==1&&massconvcmb2==6)
            finalmass=2.20462262*mass;
        else if(massconvcmb1==1&&massconvcmb2==7)
            finalmass=3.52739619*Math.pow(10,1)*mass;
        else if(massconvcmb1==1&&massconvcmb2==8)
            finalmass=5*Math.pow(10,3)*mass;
        
        else if(massconvcmb1==2&&massconvcmb2==0)     //From gram g
            finalmass=Math.pow(10,-6)*mass;
        else if(massconvcmb1==2&&massconvcmb2==1)
            finalmass=Math.pow(10,-3)*mass;
        else if(massconvcmb1==2&&massconvcmb2==3)
            finalmass=Math.pow(10,3)*mass;
        else if(massconvcmb1==2&&massconvcmb2==4)
            finalmass=Math.pow(10,6)*mass;
        else if(massconvcmb1==2&&massconvcmb2==5)
            finalmass=Math.pow(10,-5)*mass;
        else if(massconvcmb1==2&&massconvcmb2==6)
            finalmass=2.20462262*Math.pow(10,-3)*mass;
        else if(massconvcmb1==2&&massconvcmb2==7)
            finalmass=0.0352739619*mass;
        else if(massconvcmb1==2&&massconvcmb2==8)
            finalmass=5*mass;
        
        else if(massconvcmb1==3&&massconvcmb2==0)     //From Miligram mg
            finalmass=Math.pow(10,-9)*mass;
        else if(massconvcmb1==3&&massconvcmb2==1)
            finalmass=Math.pow(10,-6)*mass;
        else if(massconvcmb1==3&&massconvcmb2==2)
            finalmass=Math.pow(10,-3)*mass;
        else if(massconvcmb1==3&&massconvcmb2==4)
            finalmass=Math.pow(10,3)*mass;
        else if(massconvcmb1==3&&massconvcmb2==5)
            finalmass=Math.pow(10,-8)*mass;
        else if(massconvcmb1==3&&massconvcmb2==6)
            finalmass=2.20462262*Math.pow(10,-6)*mass;
        else if(massconvcmb1==3&&massconvcmb2==7)
            finalmass=3.52739619*Math.pow(10,-5)*mass;
        else if(massconvcmb1==3&&massconvcmb2==8)
            finalmass=5*Math.pow(10,-3)*mass;
        
        else if(massconvcmb1==4&&massconvcmb2==0)     //From Microgram mg
            finalmass=Math.pow(10,-12)*mass;
        else if(massconvcmb1==4&&massconvcmb2==1)
            finalmass=Math.pow(10,-9)*mass;
        else if(massconvcmb1==4&&massconvcmb2==2)
            finalmass=Math.pow(10,-6)*mass;
        else if(massconvcmb1==4&&massconvcmb2==3)
            finalmass=Math.pow(10,-3)*mass;
        else if(massconvcmb1==4&&massconvcmb2==5)
            finalmass=Math.pow(10,-11)*mass;
        else if(massconvcmb1==4&&massconvcmb2==6)
            finalmass=2.20462262*Math.pow(10,-9)*mass;
        else if(massconvcmb1==4&&massconvcmb2==7)
            finalmass=3.52739619*Math.pow(10,-8)*mass;
        else if(massconvcmb1==4&&massconvcmb2==8)
            finalmass=5*Math.pow(10,-6)*mass;
        
        else if(massconvcmb1==5&&massconvcmb2==0)     //From Quintal q
            finalmass=0.1*mass;
        else if(massconvcmb1==5&&massconvcmb2==1)
            finalmass=100*mass;
        else if(massconvcmb1==5&&massconvcmb2==2)
            finalmass=Math.pow(10,5)*mass;
        else if(massconvcmb1==5&&massconvcmb2==3)
            finalmass=Math.pow(10,9)*mass;
        else if(massconvcmb1==5&&massconvcmb2==4)
            finalmass=Math.pow(10,11)*mass;
        else if(massconvcmb1==5&&massconvcmb2==6)
            finalmass=220.462262*mass;
        else if(massconvcmb1==5&&massconvcmb2==7)
            finalmass=3527.39619*mass;
        else if(massconvcmb1==5&&massconvcmb2==8)
            finalmass=5*Math.pow(10,5)*mass;
        
        else if(massconvcmb1==6&&massconvcmb2==0)     //From Pound lb
            finalmass=4.5359237*Math.pow(10,-4)*mass;
        else if(massconvcmb1==6&&massconvcmb2==1)
            finalmass=0.45359237*mass;
        else if(massconvcmb1==6&&massconvcmb2==2)
            finalmass=453.59237*mass;
        else if(massconvcmb1==6&&massconvcmb2==3)
            finalmass=453592.37*mass;
        else if(massconvcmb1==6&&massconvcmb2==4)
            finalmass=4.53592370*Math.pow(10,8)*mass;
        else if(massconvcmb1==6&&massconvcmb2==5)
            finalmass=4.5359237*Math.pow(10,-3)*mass;
        else if(massconvcmb1==6&&massconvcmb2==7)
            finalmass=16*mass;
        else if(massconvcmb1==6&&massconvcmb2==8)
            finalmass=2267.96185*mass;
        
        else if(massconvcmb1==7&&massconvcmb2==0)     //From Ounce Oz
            finalmass=2.83495231*Math.pow(10,-5)*mass;
        else if(massconvcmb1==7&&massconvcmb2==1)
            finalmass=0.0283495231*mass;
        else if(massconvcmb1==7&&massconvcmb2==2)
            finalmass=28.3495231*mass;
        else if(massconvcmb1==7&&massconvcmb2==3)
            finalmass=28349.5231*mass;
        else if(massconvcmb1==7&&massconvcmb2==4)
            finalmass=28349523.1*Math.pow(10,8)*mass;
        else if(massconvcmb1==7&&massconvcmb2==5)
            finalmass=2.83495231*Math.pow(10,-4)*mass;
        else if(massconvcmb1==7&&massconvcmb2==6)
            finalmass=0.0625*mass;
        else if(massconvcmb1==7&&massconvcmb2==8)
            finalmass=141.747616*mass;
        
        else if(massconvcmb1==8&&massconvcmb2==0)     //From Carat ct
            finalmass=2*Math.pow(10,-7)*mass;
        else if(massconvcmb1==8&&massconvcmb2==1)
            finalmass=2*Math.pow(10,-4)*mass;
        else if(massconvcmb1==8&&massconvcmb2==2)
            finalmass=0.2*mass;
        else if(massconvcmb1==8&&massconvcmb2==3)
            finalmass=200*mass;
        else if(massconvcmb1==8&&massconvcmb2==4)
            finalmass=2*Math.pow(10,5)*mass;
        else if(massconvcmb1==8&&massconvcmb2==5)
            finalmass=2*Math.pow(10,-6)*mass;
        else if(massconvcmb1==8&&massconvcmb2==6)
            finalmass=4.40925424*Math.pow(10,-4)*mass;
        else if(massconvcmb1==8&&massconvcmb2==7)
            finalmass=7.05479239*Math.pow(10,-3)*mass;
        
        JOptionPane.showMessageDialog(null, " Your "+mass+" "+ massConvCMB1.getSelectedItem()+
                    " mass is "+finalmass+" "+ massConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_massConvCalcActionPerformed

    private void timeConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeConvCMB1ActionPerformed
        timeconvcmb1=timeConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_timeConvCMB1ActionPerformed

    private void timeConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeConvCMB2ActionPerformed
        timeconvcmb2=timeConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_timeConvCMB2ActionPerformed

    private void timeConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeConvCalcActionPerformed

        time = Double.parseDouble(timeConvCalcT1.getText());       

        if(timeconvcmb1==timeconvcmb2)
            finaltime=time;

        else if(timeconvcmb1==0&&timeconvcmb2==1)
            finaltime=52.1428571*time;
        else if(timeconvcmb1==0&&timeconvcmb2==2)
            finaltime=365*time;
        else if(timeconvcmb1==0&&timeconvcmb2==3)
            finaltime=8760*time;
        else if(timeconvcmb1==0&&timeconvcmb2==4)
            finaltime=525600*time;
        else if(timeconvcmb1==0&&timeconvcmb2==5)
            finaltime=31536000*time;
        else if(timeconvcmb1==0&&timeconvcmb2==6)
            finaltime=3.1536*Math.pow(10,10)*time;
        else if(timeconvcmb1==0&&timeconvcmb2==7)
            finaltime=3.1536*Math.pow(10,13)*time;
        else if(timeconvcmb1==0&&timeconvcmb2==8)
            finaltime=3.1536*Math.pow(10,19)*time;
        
        else if(timeconvcmb1==1&&timeconvcmb2==0)
            finaltime=0.0191780822*time;
        else if(timeconvcmb1==1&&timeconvcmb2==2)
            finaltime=7*time;
        else if(timeconvcmb1==1&&timeconvcmb2==3)
            finaltime=168*time;
        else if(timeconvcmb1==1&&timeconvcmb2==4)
            finaltime=10080*time;
        else if(timeconvcmb1==1&&timeconvcmb2==5)
            finaltime=604800*time;
        else if(timeconvcmb1==1&&timeconvcmb2==6)
            finaltime=6.048*Math.pow(10,8)*time;
        else if(timeconvcmb1==1&&timeconvcmb2==7)
            finaltime=6.048*Math.pow(10,11)*time;
        else if(timeconvcmb1==1&&timeconvcmb2==8)
            finaltime=6.048*Math.pow(10,17)*time;
        
        else if(timeconvcmb1==2&&timeconvcmb2==0)
            finaltime=0.00273972603*time;
        else if(timeconvcmb1==2&&timeconvcmb2==1)
            finaltime=0.142857143*time;
        else if(timeconvcmb1==2&&timeconvcmb2==3)
            finaltime=24*time;
        else if(timeconvcmb1==2&&timeconvcmb2==4)
            finaltime=1440*time;
        else if(timeconvcmb1==2&&timeconvcmb2==5)
            finaltime=86400*time;
        else if(timeconvcmb1==2&&timeconvcmb2==6)
            finaltime=8.64*Math.pow(10,7)*time;
        else if(timeconvcmb1==2&&timeconvcmb2==7)
            finaltime=8.64*Math.pow(10,10)*time;
        else if(timeconvcmb1==2&&timeconvcmb2==8)
            finaltime=8.64*Math.pow(10,16)*time;
        
        else if(timeconvcmb1==3&&timeconvcmb2==0)
            finaltime=1.14155251*Math.pow(10,-4)*time;
        else if(timeconvcmb1==3&&timeconvcmb2==1)
            finaltime=5.95238095*Math.pow(10,-3)*time;
        else if(timeconvcmb1==3&&timeconvcmb2==2)
            finaltime=0.0416666667*time;
        else if(timeconvcmb1==3&&timeconvcmb2==4)
            finaltime=60*time;
        else if(timeconvcmb1==3&&timeconvcmb2==5)
            finaltime=3600*time;
        else if(timeconvcmb1==3&&timeconvcmb2==6)
            finaltime=3.6*Math.pow(10,6)*time;
        else if(timeconvcmb1==3&&timeconvcmb2==7)
            finaltime=3.6*Math.pow(10,9)*time;
        else if(timeconvcmb1==3&&timeconvcmb2==8)
            finaltime=3.6*Math.pow(10,15)*time;
        
        else if(timeconvcmb1==4&&timeconvcmb2==0)
            finaltime=1.90258752*Math.pow(10,-6)*time;
        else if(timeconvcmb1==4&&timeconvcmb2==1)
            finaltime=9.90263492*Math.pow(10,-5)*time;
        else if(timeconvcmb1==4&&timeconvcmb2==2)
            finaltime=6.94444444*Math.pow(10,-4)*time;
        else if(timeconvcmb1==4&&timeconvcmb2==3)
            finaltime=0.016666667*time;
        else if(timeconvcmb1==4&&timeconvcmb2==5)
            finaltime=60*time;
        else if(timeconvcmb1==4&&timeconvcmb2==6)
            finaltime=6*Math.pow(10,4)*time;
        else if(timeconvcmb1==4&&timeconvcmb2==7)
            finaltime=6*Math.pow(10,7)*time;
        else if(timeconvcmb1==4&&timeconvcmb2==8)
            finaltime=3.6*Math.pow(10,13)*time;
        
        else if(timeconvcmb1==5&&timeconvcmb2==0)
            finaltime=3.1709792*Math.pow(10,-8)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==1)
            finaltime=1.65343915*Math.pow(10,-6)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==2)
            finaltime=1.15740741*Math.pow(10,-5)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==3)
            finaltime=2.77777778*Math.pow(10,4)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==4)
            finaltime=0.16666667*time;
        else if(timeconvcmb1==5&&timeconvcmb2==6)
            finaltime=Math.pow(10,3)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==7)
            finaltime=Math.pow(10,6)*time;
        else if(timeconvcmb1==5&&timeconvcmb2==8)
            finaltime=Math.pow(10,12)*time;
        
        else if(timeconvcmb1==6&&timeconvcmb2==0)
            finaltime=3.1709792*Math.pow(10,-11)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==1)
            finaltime=1.65343915*Math.pow(10,-9)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==2)
            finaltime=1.15740741*Math.pow(10,-8)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==3)
            finaltime=2.77777778*Math.pow(10,-7)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==4)
            finaltime=0.16666667*Math.pow(10,-5)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==5)
            finaltime=Math.pow(10,-3)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==7)
            finaltime=Math.pow(10,3)*time;
        else if(timeconvcmb1==6&&timeconvcmb2==8)
            finaltime=Math.pow(10,9)*time;
        
        else if(timeconvcmb1==7&&timeconvcmb2==0)
            finaltime=3.1709792*Math.pow(10,-14)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==1)
            finaltime=1.65343915*Math.pow(10,-12)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==2)
            finaltime=1.15740741*Math.pow(10,-11)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==3)
            finaltime=2.77777778*Math.pow(10,-10)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==4)
            finaltime=0.16666667*Math.pow(10,-8)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==5)
            finaltime=Math.pow(10,-6)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==6)
            finaltime=Math.pow(10,-3)*time;
        else if(timeconvcmb1==7&&timeconvcmb2==8)
            finaltime=Math.pow(10,6)*time;
       
        else if(timeconvcmb1==8&&timeconvcmb2==0)
            finaltime=3.1709792*Math.pow(10,-20)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==1)
            finaltime=1.65343915*Math.pow(10,-18)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==2)
            finaltime=1.15740741*Math.pow(10,-17)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==3)
            finaltime=2.77777778*Math.pow(10,-16)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==4)
            finaltime=0.16666667*Math.pow(10,-14)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==5)
            finaltime=Math.pow(10,-12)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==6)
            finaltime=Math.pow(10,-9)*time;
        else if(timeconvcmb1==8&&timeconvcmb2==7)
            finaltime=Math.pow(10,-6)*time;

        JOptionPane.showMessageDialog(null, " Your "+time+" "+timeConvCMB1.getSelectedItem()+
                    " time is "+finaltime+" "+timeConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_timeConvCalcActionPerformed

    private void speedConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedConvCMB1ActionPerformed
       speedconvcmb1=speedConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_speedConvCMB1ActionPerformed

    private void speedConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedConvCMB2ActionPerformed
        speedconvcmb2=speedConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_speedConvCMB2ActionPerformed

    private void speedConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speedConvCalcActionPerformed

        speed = Double.parseDouble(speedConvCalcT1.getText());
        
        if(speedconvcmb1==speedconvcmb2)
            finalspeed=speed;

        else if(speedconvcmb1==0&&speedconvcmb2==1)
            finalspeed=8.80965201*Math.pow(10,5)*speed;
        else if(speedconvcmb1==0&&speedconvcmb2==2)
            finalspeed=2.99792458*Math.pow(10,8)*speed;
        else if(speedconvcmb1==0&&speedconvcmb2==3)
            finalspeed=1.07925285*Math.pow(10,9)*speed;
        else if(speedconvcmb1==0&&speedconvcmb2==4)
            finalspeed=2.99792458*Math.pow(10,5)*speed;
        else if(speedconvcmb1==0&&speedconvcmb2==5)
            finalspeed=5.82749918*Math.pow(10,8)*speed;
        else if(speedconvcmb1==0&&speedconvcmb2==6)
            finalspeed=6.70616629*Math.pow(10,9)*speed;
        
        else if(speedconvcmb1==1&&speedconvcmb2==0)
            finalspeed=1.3511862*Math.pow(10,-6)*speed;
        else if(speedconvcmb1==1&&speedconvcmb2==2)
            finalspeed=340.3*speed;
        else if(speedconvcmb1==1&&speedconvcmb2==3)
            finalspeed=1225.08*speed;
        else if(speedconvcmb1==1&&speedconvcmb2==4)
            finalspeed=0.3403*speed;
        else if(speedconvcmb1==1&&speedconvcmb2==5)
            finalspeed=661.490281*speed;
        else if(speedconvcmb1==1&&speedconvcmb2==6)
            finalspeed=761.22942*speed;
        
        else if(speedconvcmb1==2&&speedconvcmb2==0)
            finalspeed=3.33564095*Math.pow(10,-9)*speed;
        else if(speedconvcmb1==2&&speedconvcmb2==1)
            finalspeed=2.9385836*Math.pow(10,3)*speed;
        else if(speedconvcmb1==2&&speedconvcmb2==3)
            finalspeed=3.6*speed;
        else if(speedconvcmb1==2&&speedconvcmb2==4)
            finalspeed=Math.pow(10,-3)*speed;
        else if(speedconvcmb1==2&&speedconvcmb2==5)
            finalspeed=1.9438449*speed;
        else if(speedconvcmb1==2&&speedconvcmb2==6)
            finalspeed=2.23693629*speed;

        else if(speedconvcmb1==3&&speedconvcmb2==0)
            finalspeed=9.26566931*Math.pow(10,-10)*speed;
        else if(speedconvcmb1==3&&speedconvcmb2==1)
            finalspeed=8.16273223*Math.pow(10,-4)*speed;
        else if(speedconvcmb1==3&&speedconvcmb2==2)
            finalspeed=0.277777778*speed;
        else if(speedconvcmb1==3&&speedconvcmb2==4)
            finalspeed=2.77777778*Math.pow(10,-4)*speed;
        else if(speedconvcmb1==3&&speedconvcmb2==5)
            finalspeed=0.539956803*speed;
        else if(speedconvcmb1==3&&speedconvcmb2==6)
            finalspeed=0.621371192*speed;
        
        else if(speedconvcmb1==4&&speedconvcmb2==0)
            finalspeed=3.33564095*Math.pow(10,-6)*speed;
        else if(speedconvcmb1==4&&speedconvcmb2==1)
            finalspeed=2.9385836*speed;
        else if(speedconvcmb1==4&&speedconvcmb2==2)
            finalspeed=Math.pow(10,3)*speed;
        else if(speedconvcmb1==4&&speedconvcmb2==3)
            finalspeed=3.6*Math.pow(10,3)*speed;
        else if(speedconvcmb1==4&&speedconvcmb2==5)
            finalspeed=1943.84449*speed;
        else if(speedconvcmb1==4&&speedconvcmb2==6)
            finalspeed=2236.93629*speed;
        
        else if(speedconvcmb1==5&&speedconvcmb2==0)
            finalspeed=1.71600196*Math.pow(10,-9)*speed;
        else if(speedconvcmb1==5&&speedconvcmb2==1)
            finalspeed=1.51173801*Math.pow(10,-3)*speed;
        else if(speedconvcmb1==5&&speedconvcmb2==2)
            finalspeed=0.514444444*speed;
        else if(speedconvcmb1==5&&speedconvcmb2==3)
            finalspeed=1.852*speed;
        else if(speedconvcmb1==5&&speedconvcmb2==4)
            finalspeed=0.5149444444*Math.pow(10,-4)*speed;
        else if(speedconvcmb1==5&&speedconvcmb2==6)
            finalspeed=1.15077945*speed;

        else if(speedconvcmb1==6&&speedconvcmb2==0)
            finalspeed=1.49116493*Math.pow(10,-9)*speed;
        else if(speedconvcmb1==6&&speedconvcmb2==1)
            finalspeed=1.3136441*Math.pow(10,-3)*speed;
        else if(speedconvcmb1==6&&speedconvcmb2==2)
            finalspeed=0.44704*speed;
        else if(speedconvcmb1==6&&speedconvcmb2==3)
            finalspeed=1.609344*speed;
        else if(speedconvcmb1==6&&speedconvcmb2==4)
            finalspeed=0.49704*Math.pow(10,4)*speed;
        else if(speedconvcmb1==6&&speedconvcmb2==5)
            finalspeed=0.868976242*speed;
       
        JOptionPane.showMessageDialog(null, " Your "+speed+" "+speedConvCMB1.getSelectedItem()+
                    " speed is "+finalspeed+" "+speedConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_speedConvCalcActionPerformed

    private void areaConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaConvCMB1ActionPerformed
        areaconvcmb1=areaConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_areaConvCMB1ActionPerformed

    private void areaConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaConvCMB2ActionPerformed
        areaconvcmb2=areaConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_areaConvCMB2ActionPerformed

    private void areaConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaConvCalcActionPerformed

        area = Double.parseDouble(areaConvCalcT1.getText());

        if(areaconvcmb1==areaconvcmb2)
            finalarea=area;
        else if(areaconvcmb1==0&&areaconvcmb2==1)
            finalarea=100*area;
        else if(areaconvcmb1==0&&areaconvcmb2==2)
            finalarea=Math.pow(10,4)*area;
        else if(areaconvcmb1==0&&areaconvcmb2==3)
            finalarea=Math.pow(10,6)*area;
        else if(areaconvcmb1==0&&areaconvcmb2==4)
            finalarea=247.105407*area;
        else if(areaconvcmb1==0&&areaconvcmb2==5)
            finalarea=0.386102159*area;
        else if(areaconvcmb1==0&&areaconvcmb2==6)
            finalarea=1.19599005*Math.pow(10,6)*area;
        else if(areaconvcmb1==0&&areaconvcmb2==7)
            finalarea=1.07639104*Math.pow(10,7)*area;
        else if(areaconvcmb1==0&&areaconvcmb2==8)
            finalarea=1.5500031*Math.pow(10,9)*area;

        else if(areaconvcmb1==1&&areaconvcmb2==0)
            finalarea=0.01*area;
        else if(areaconvcmb1==1&&areaconvcmb2==2)
            finalarea=Math.pow(10,4)*area;
        else if(areaconvcmb1==1&&areaconvcmb2==3)
            finalarea=Math.pow(10,6)*area;
        else if(areaconvcmb1==1&&areaconvcmb2==4)
            finalarea=247.105407*area;
        else if(areaconvcmb1==1&&areaconvcmb2==5)
            finalarea=0.386102159*area;
        else if(areaconvcmb1==1&&areaconvcmb2==6)
            finalarea=1.19599005*Math.pow(10,6)*area;
        else if(areaconvcmb1==1&&areaconvcmb2==7)
            finalarea=1.07639104*Math.pow(10,7)*area;
        else if(areaconvcmb1==1&&areaconvcmb2==8)
            finalarea=1.5500031*Math.pow(10,9)*area;
        
        else if(areaconvcmb1==2&&areaconvcmb2==0)
            finalarea=0.0001*area;
        else if(areaconvcmb1==2&&areaconvcmb2==1)
            finalarea=0.01*area;
        else if(areaconvcmb1==2&&areaconvcmb2==3)
            finalarea=100*area;
        else if(areaconvcmb1==2&&areaconvcmb2==4)
            finalarea=0.0247105407*area;
        else if(areaconvcmb1==2&&areaconvcmb2==5)
            finalarea=3.86102159*Math.pow(10,-5)*area;
        else if(areaconvcmb1==2&&areaconvcmb2==6)
            finalarea=119.599005*area;
        else if(areaconvcmb1==2&&areaconvcmb2==7)
            finalarea=1076.39104*area;
        else if(areaconvcmb1==2&&areaconvcmb2==8)
            finalarea=155000.31*area;
        
        else if(areaconvcmb1==3&&areaconvcmb2==0)
            finalarea=Math.pow(10,-6)*area;
        else if(areaconvcmb1==3&&areaconvcmb2==1)
            finalarea=0.0001*area;
        else if(areaconvcmb1==3&&areaconvcmb2==2)
            finalarea=0.001*area;
        else if(areaconvcmb1==3&&areaconvcmb2==4)
            finalarea=2.47105407*Math.pow(10,-4)*area;
        else if(areaconvcmb1==3&&areaconvcmb2==5)
            finalarea=3.86102159*Math.pow(10,-7)*area;
        else if(areaconvcmb1==3&&areaconvcmb2==6)
            finalarea=1.19599005*area;
        else if(areaconvcmb1==3&&areaconvcmb2==7)
            finalarea=10.7639104*area;
        else if(areaconvcmb1==3&&areaconvcmb2==8)
            finalarea=1550.0031*area;
        
        else if(areaconvcmb1==4&&areaconvcmb2==0)
            finalarea=0.004046856*area;
        else if(areaconvcmb1==4&&areaconvcmb2==1)
            finalarea=0.4046856*area;
        else if(areaconvcmb1==4&&areaconvcmb2==2)
            finalarea=40.46856*area;
        else if(areaconvcmb1==4&&areaconvcmb2==3)
            finalarea=4046.856*area;
        else if(areaconvcmb1==4&&areaconvcmb2==5)
            finalarea=1.56249984*Math.pow(10,-3)*area;
        else if(areaconvcmb1==4&&areaconvcmb2==6)
            finalarea=4839.99949*area;
        else if(areaconvcmb1==4&&areaconvcmb2==7)
            finalarea=43559.9955*area;
        else if(areaconvcmb1==4&&areaconvcmb2==8)
            finalarea=6272639.35*area;
        
        else if(areaconvcmb1==5&&areaconvcmb2==0)
            finalarea=2.58998811*area;
        else if(areaconvcmb1==5&&areaconvcmb2==1)
            finalarea=258.998811*area;
        else if(areaconvcmb1==5&&areaconvcmb2==2)
            finalarea=25899.8811*area;
        else if(areaconvcmb1==5&&areaconvcmb2==3)
            finalarea=2.58998811*Math.pow(10,6)*area;
        else if(areaconvcmb1==5&&areaconvcmb2==4)
            finalarea=640.000067*area;
        else if(areaconvcmb1==5&&areaconvcmb2==6)
            finalarea=3.097600*Math.pow(10,6)*area;
        else if(areaconvcmb1==5&&areaconvcmb2==7)
            finalarea=2.7878400*Math.pow(10,7)*area;
        else if(areaconvcmb1==5&&areaconvcmb2==8)
            finalarea=4.0144896*Math.pow(10,9)*area;
        
        else if(areaconvcmb1==6&&areaconvcmb2==0)
            finalarea=8.3612736*Math.pow(10,-7)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==1)
            finalarea=8.3612736*Math.pow(10,-5)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==2)
            finalarea=8.3612736*Math.pow(10,-3)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==3)
            finalarea=8.3612736*Math.pow(10,-1)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==4)
            finalarea=2.06611592*Math.pow(10,4)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==5)
            finalarea=3.22830579*Math.pow(10,-7)*area;
        else if(areaconvcmb1==6&&areaconvcmb2==7)
            finalarea=9*area;
        else if(areaconvcmb1==6&&areaconvcmb2==8)
            finalarea=1296*area;
        
        else if(areaconvcmb1==7&&areaconvcmb2==0)
            finalarea=9.290304*Math.pow(10,-8)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==1)
            finalarea=9.290304*Math.pow(10,-6)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==2)
            finalarea=9.290304*Math.pow(10,-4)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==3)
            finalarea=9.290304*Math.pow(10,-2)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==4)
            finalarea=2.29568435*Math.pow(10,-5)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==5)
            finalarea=3.58700643*Math.pow(10,-8)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==6)
            finalarea=1.11111111*Math.pow(10,-1)*area;
        else if(areaconvcmb1==7&&areaconvcmb2==8)
            finalarea=144*area;
        
        else if(areaconvcmb1==8&&areaconvcmb2==0)
            finalarea=6.4516*Math.pow(10,-10)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==1)
            finalarea=6.4516*Math.pow(10,-8)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==2)
            finalarea=6.4516*Math.pow(10,-6)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==3)
            finalarea=6.4516*Math.pow(10,-4)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==4)
            finalarea=1.59422525*Math.pow(10,-7)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==5)
            finalarea=2.49097669*Math.pow(10,-10)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==6)
            finalarea=77.1604938*Math.pow(10,-4)*area;
        else if(areaconvcmb1==8&&areaconvcmb2==7)
            finalarea=6.94444444*Math.pow(10,-3)*area;
        
        JOptionPane.showMessageDialog(null, " Your "+area+" "+areaConvCMB1.getSelectedItem()+
                    " area is "+finalarea+" "+areaConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_areaConvCalcActionPerformed

    private void volumeConvCMB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeConvCMB1ActionPerformed
        volumeconvcmb1=volumeConvCMB1.getSelectedIndex();
    }//GEN-LAST:event_volumeConvCMB1ActionPerformed

    private void volumeConvCMB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeConvCMB2ActionPerformed
        volumeconvcmb2=volumeConvCMB2.getSelectedIndex();
    }//GEN-LAST:event_volumeConvCMB2ActionPerformed

    private void volumeConvCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volumeConvCalcActionPerformed
        volume = Double.parseDouble(volumeConvCalcT1.getText());

        if(volumeconvcmb1==volumeconvcmb2)
            finalvolume=volume;
        
        else if(volumeconvcmb1==0&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,6)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,9)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,4)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,5)*volume;
        else if(volumeconvcmb1==0&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,6)*volume;
        
        else if(volumeconvcmb1==1&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,6)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,0)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,2)*volume;
        else if(volumeconvcmb1==1&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,3)*volume;
        
        else if(volumeconvcmb1==2&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-6)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-5)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,-1)*volume;
        else if(volumeconvcmb1==2&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,0)*volume;
        
        else if(volumeconvcmb1==3&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-9)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,-6)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-8)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,-6)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,-5)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,-4)*volume;
        else if(volumeconvcmb1==3&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,-3)*volume;
        
        else if(volumeconvcmb1==4&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-1)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,2)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,5)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,8)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,2)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,4)*volume;
        else if(volumeconvcmb1==4&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,5)*volume;
        
        else if(volumeconvcmb1==5&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,0)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,6)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,2)*volume;
        else if(volumeconvcmb1==5&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,3)*volume;
        
        else if(volumeconvcmb1==6&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-4)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,-1)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,2)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,5)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,-1)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==6&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,2)*volume;
        
        else if(volumeconvcmb1==7&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-5)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,4)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-4)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,-1)*volume;
        else if(volumeconvcmb1==7&&volumeconvcmb2==8)
            finalvolume=Math.pow(10,1)*volume;
        
        else if(volumeconvcmb1==8&&volumeconvcmb2==0)
            finalvolume=Math.pow(10,-6)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==1)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==2)
            finalvolume=Math.pow(10,1)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==3)
            finalvolume=Math.pow(10,3)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==4)
            finalvolume=Math.pow(10,-5)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==5)
            finalvolume=Math.pow(10,-3)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==6)
            finalvolume=Math.pow(10,-2)*volume;
        else if(volumeconvcmb1==8&&volumeconvcmb2==7)
            finalvolume=Math.pow(10,-1)*volume;
        
        JOptionPane.showMessageDialog(null, " Your "+volume+" "+volumeConvCMB1.getSelectedItem()+
                    " volume is "+finalvolume+" "+volumeConvCMB2.getSelectedItem() , "RESULTS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_volumeConvCalcActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables

    private javax.swing.JButton AgeCalcBackB;

    private javax.swing.JButton AreaConvCalcBackB;

    private javax.swing.JButton BMICalcBackB;

    private javax.swing.JButton CurrencyConvCalcBackB;

    private javax.swing.JTextField DOBl1;

    private javax.swing.JButton DateDiffBackB;

    private javax.swing.JButton DisCalcBackB;

    private javax.swing.JButton GSTCalcB;

    private javax.swing.JButton GSTCalcBackB;

    private javax.swing.JButton HomeExitB;

    private javax.swing.JButton InvestmentCalcBackB;

    private javax.swing.JButton LengthConvCalcBackB;

    private javax.swing.JButton LoanCalcBackB;

    private javax.swing.JButton MassConvCalcBackB;

    private javax.swing.JButton NumSysConvCalcBackB;

    private javax.swing.JButton PerCalcBackB;

    private javax.swing.JButton QuadEqnBackB;

    private javax.swing.JButton QuadEqnShowB;

    private javax.swing.JButton SciCalcBackB;

    private javax.swing.JButton SpeedConvCalcBackB;

    private javax.swing.JButton SplitBillCalcBackB;

    private javax.swing.JButton StorageSizeConvCalcBackB;

    private javax.swing.JButton TempConvCalcBackB;

    private javax.swing.JButton TimeConvCalcBackB;

    private javax.swing.JButton VolumeConvCalcBackB;

    private javax.swing.JButton ageCalcB;

    private javax.swing.JButton ageCalcButton;

    private javax.swing.JTextField amtLoanCalcT1;

    private javax.swing.JTextField amtSplitBillCalcT1;

    private javax.swing.JComboBox<String> areaConvCMB1;

    private javax.swing.JComboBox<String> areaConvCMB2;

    private javax.swing.JButton areaConvCalc;

    private javax.swing.JButton areaConvCalcB;

    private javax.swing.JTextField areaConvCalcT1;

    private javax.swing.JButton bmiCalcB;

    private javax.swing.ButtonGroup buttonGroup1;

    private javax.swing.ButtonGroup buttonGroup2;

    private javax.swing.JComboBox<String> currencyConvCMB1;

    private javax.swing.JComboBox<String> currencyConvCMB2;

    private javax.swing.JButton currencyConvCalcB;

    private javax.swing.JButton currencyConvCalculateB;

    private javax.swing.JTextField currencyConvL1;

    private javax.swing.JButton dateCalcB;

    private javax.swing.JButton datedDiffCalcB;

    private javax.swing.JButton disCalcB;

    private javax.swing.JTextField dt1;

    private javax.swing.JTextField dt2;

    private javax.swing.JTextField dt3;

    private javax.swing.JTextArea dta1;

    private javax.swing.JTextField enddatel2;

    private javax.swing.JButton gstCalcCalcB;

    private javax.swing.JRadioButton gstCalcR1;

    private javax.swing.JRadioButton gstCalcR2;

    private javax.swing.JRadioButton gstCalcR3;

    private javax.swing.JRadioButton gstCalcR4;

    private javax.swing.JRadioButton gstCalcR5;

    private javax.swing.JTextField gstCalcT1;

    private javax.swing.JTextField interestLoanCalcT2;

    private javax.swing.JButton investCalcB;

    private javax.swing.JComboBox<String> investmentCalcCMB1;

    private javax.swing.JComboBox<String> investmentCalcCMB2;

    private javax.swing.JButton investmentCalcCalcB;

    private javax.swing.JTextField investmentCalcT1;

    private javax.swing.JTextField investmentCalcT2;

    private javax.swing.JButton jButton1;

    private javax.swing.JButton jButton12;

    private javax.swing.JButton jButton13;

    private javax.swing.JButton jButton2;

    private javax.swing.JButton jButton3;

    private javax.swing.JButton jButton7;

    private javax.swing.JLabel jLabel1;

    private javax.swing.JLabel jLabel10;

    private javax.swing.JLabel jLabel11;

    private javax.swing.JLabel jLabel12;

    private javax.swing.JLabel jLabel13;

    private javax.swing.JLabel jLabel14;

    private javax.swing.JLabel jLabel15;

    private javax.swing.JLabel jLabel16;

    private javax.swing.JLabel jLabel17;

    private javax.swing.JLabel jLabel18;

    private javax.swing.JLabel jLabel19;

    private javax.swing.JLabel jLabel2;

    private javax.swing.JLabel jLabel20;

    private javax.swing.JLabel jLabel21;

    private javax.swing.JLabel jLabel22;

    private javax.swing.JLabel jLabel23;

    private javax.swing.JLabel jLabel24;

    private javax.swing.JLabel jLabel25;

    private javax.swing.JLabel jLabel26;

    private javax.swing.JLabel jLabel27;

    private javax.swing.JLabel jLabel28;

    private javax.swing.JLabel jLabel29;

    private javax.swing.JLabel jLabel3;

    private javax.swing.JLabel jLabel30;

    private javax.swing.JLabel jLabel31;

    private javax.swing.JLabel jLabel32;

    private javax.swing.JLabel jLabel33;

    private javax.swing.JLabel jLabel34;

    private javax.swing.JLabel jLabel35;

    private javax.swing.JLabel jLabel36;

    private javax.swing.JLabel jLabel37;

    private javax.swing.JLabel jLabel38;

    private javax.swing.JLabel jLabel39;

    private javax.swing.JLabel jLabel4;

    private javax.swing.JLabel jLabel40;

    private javax.swing.JLabel jLabel41;

    private javax.swing.JLabel jLabel42;

    private javax.swing.JLabel jLabel43;

    private javax.swing.JLabel jLabel44;

    private javax.swing.JLabel jLabel45;

    private javax.swing.JLabel jLabel46;

    private javax.swing.JLabel jLabel47;

    private javax.swing.JLabel jLabel48;

    private javax.swing.JLabel jLabel49;

    private javax.swing.JLabel jLabel5;

    private javax.swing.JLabel jLabel50;

    private javax.swing.JLabel jLabel51;

    private javax.swing.JLabel jLabel52;

    private javax.swing.JLabel jLabel53;

    private javax.swing.JLabel jLabel54;

    private javax.swing.JLabel jLabel55;

    private javax.swing.JLabel jLabel56;

    private javax.swing.JLabel jLabel57;

    private javax.swing.JLabel jLabel58;

    private javax.swing.JLabel jLabel59;

    private javax.swing.JLabel jLabel6;

    private javax.swing.JLabel jLabel60;

    private javax.swing.JLabel jLabel61;

    private javax.swing.JLabel jLabel62;

    private javax.swing.JLabel jLabel63;

    private javax.swing.JLabel jLabel64;

    private javax.swing.JLabel jLabel65;

    private javax.swing.JLabel jLabel66;

    private javax.swing.JLabel jLabel67;

    private javax.swing.JLabel jLabel68;

    private javax.swing.JLabel jLabel69;

    private javax.swing.JLabel jLabel7;

    private javax.swing.JLabel jLabel8;

    private javax.swing.JLabel jLabel9;

    private javax.swing.JRadioButton jRadioButton1;

    private javax.swing.JRadioButton jRadioButton2;

    private javax.swing.JRadioButton jRadioButton3;

    private javax.swing.JRadioButton jRadioButton4;

    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JScrollPane jScrollPane2;

    private javax.swing.JTextArea jTextArea1;

    private javax.swing.JComboBox<String> lengthConvCMB1;

    private javax.swing.JComboBox<String> lengthConvCMB2;

    private javax.swing.JButton lengthConvCalcB;

    private javax.swing.JButton lengthConvCalcCalcB;

    private javax.swing.JTextField lengthConvCalcT1;

    private javax.swing.JButton loanCalcB;

    private javax.swing.JButton loanCalcCalcB;

    private javax.swing.JComboBox<String> massConvCMB1;

    private javax.swing.JComboBox<String> massConvCMB2;

    private javax.swing.JButton massConvCalc;

    private javax.swing.JButton massConvCalcB;

    private javax.swing.JTextField massConvCalcT1;

    private javax.swing.JComboBox<String> monthLoanCalcCMB2;

    private javax.swing.JComboBox<String> numSysConvCMB1;

    private javax.swing.JComboBox<String> numSysConvCMB2;

    private javax.swing.JButton numSysConvCalc;

    private javax.swing.JButton numSysConvCalcB;

    private javax.swing.JTextField numSysConvT1;

    private javax.swing.JButton perCalcB;

    private javax.swing.JPanel pnlAgeCalc;

    private javax.swing.JPanel pnlAreaConvCalc;

    private javax.swing.JPanel pnlBMICalc;

    private javax.swing.JPanel pnlCurrencyConvCalc;

    private javax.swing.JPanel pnlDateDiffCalc;

    private javax.swing.JPanel pnlDiscountCalc;

    private javax.swing.JPanel pnlGSTCalc;

    private javax.swing.JPanel pnlHome;

    private javax.swing.JPanel pnlInvestmentCalc;

    private javax.swing.JPanel pnlLengthConvCalc;

    private javax.swing.JPanel pnlLoanCalc;

    private javax.swing.JPanel pnlMassConvCalc;

    private javax.swing.JPanel pnlNumSystemConvCalc;

    private javax.swing.JPanel pnlPercentageCalc;

    private javax.swing.JPanel pnlQuadEqnsCalc;

    private javax.swing.JPanel pnlSciCalc;

    private javax.swing.JPanel pnlSpeedConvCalc;

    private javax.swing.JPanel pnlSplitBillCalc;

    private javax.swing.JPanel pnlStorageSizeConvCalc;

    private javax.swing.JPanel pnlTemperatureConvCalc;

    private javax.swing.JPanel pnlTimeConvCalc;

    private javax.swing.JPanel pnlVolumeConvCalc;

    private javax.swing.JTextField pplSplitBillCalcT2;

    private javax.swing.JButton quadCalcB;

    private javax.swing.JComboBox<String> quadEqncmb1;

    private javax.swing.JComboBox<String> quadEqnscmb2;

    private javax.swing.JComboBox<String> quadEqnscmb3;

    private javax.swing.JButton sciCalcB;

    private javax.swing.JComboBox<String> sizeConvCMB1;

    private javax.swing.JComboBox<String> sizeConvCMB2;

    private javax.swing.JButton sizeConvCalcB;

    private javax.swing.JTextField sizeConvT1;

    private javax.swing.JButton spdConvCalcB;

    private javax.swing.JComboBox<String> speedConvCMB1;

    private javax.swing.JComboBox<String> speedConvCMB2;

    private javax.swing.JButton speedConvCalc;

    private javax.swing.JTextField speedConvCalcT1;

    private javax.swing.JButton splitBillCalcB;

    private javax.swing.JButton splitBillCalcCalcB;

    private javax.swing.JTextField splitamtSplitBillCalcT1;

    private javax.swing.JTextField startdatel1;

    private javax.swing.JButton storageSizeConvCalcB;

    private javax.swing.JComboBox<String> tempConvCMB1;

    private javax.swing.JComboBox<String> tempConvCMB2;

    private javax.swing.JButton tempConvCalc;

    private javax.swing.JButton tempConvCalcB;

    private javax.swing.JTextField tempConvT1;

    private javax.swing.JComboBox<String> timeConvCMB1;

    private javax.swing.JComboBox<String> timeConvCMB2;

    private javax.swing.JButton timeConvCalc;

    private javax.swing.JButton timeConvCalcB;

    private javax.swing.JTextField timeConvCalcT1;

    private javax.swing.JButton volConvCalcB;

    private javax.swing.JComboBox<String> volumeConvCMB1;

    private javax.swing.JComboBox<String> volumeConvCMB2;

    private javax.swing.JButton volumeConvCalc;

    private javax.swing.JTextField volumeConvCalcT1;

    private javax.swing.JComboBox<String> yearsLoanCalcCMB1;

    // End of variables declaration//GEN-END:variables

}