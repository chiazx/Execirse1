package com.example.execirse1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carPrice:EditText=findViewById(R.id.editTextCarPrice)
        var DownPayment:EditText=findViewById(R.id.editTextDownPayment)
        var interestRate:EditText=findViewById(R.id.editTextInterestRate)
        var loanPeriod:EditText=findViewById(R.id.editTextLoanPeriod)

        var carLoan:TextView=findViewById(R.id.textViewLoan)
        var Interest:TextView=findViewById(R.id.textViewInterest)
        var monthly:TextView=findViewById(R.id.textViewMonthlyRepayment)

        var countButton:Button=findViewById(R.id.buttonCalculate)
        var reset:Button=findViewById(R.id.buttonReset)


        countButton.setOnClickListener {
            var cp:Double=carPrice.text.toString().toDouble()
            var dp:Double=DownPayment.text.toString().toDouble()
            var ir:Double=interestRate.text.toString().toDouble()/100
            var lp:Double=loanPeriod.text.toString().toDouble()

            var ct:Double=cp - dp
            var interes:Double=ct * ir * lp
            var mon:Double=(ct + interes)/lp /12


            carLoan.text="Loan :"+ct.toString()
            Interest.text="Interest :"+interes.toString()
            monthly.text="Monthly Repayment :"+mon.toString()

        }
        reset.setOnClickListener{
            carPrice.setText("")
            DownPayment.setText("")
            interestRate.setText("")
            loanPeriod.setText("")

            carLoan.text="Loan :"
            Interest.text="Interest :"
            monthly.text="Monthly Repayment :"
        }
    }
}
