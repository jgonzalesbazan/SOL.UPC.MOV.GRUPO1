package pe.gob.fondepes.demo.portal.certificaciones.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import pe.gob.fondepes.demo.portal.certificaciones.R
import pe.gob.fondepes.demo.portal.certificaciones.classes.Certificate

class CertificateAdapter(context: Context, private val certificates: List<Certificate>) : ArrayAdapter<Certificate>(context, 0, certificates){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val certificate = certificates[position]
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.certificate_item, parent, false)
        view.findViewById<TextView>(R.id.txtTitleCertDetail).text = certificate.title
        view.findViewById<TextView>(R.id.txtDateCertDetail).text = certificate.date
        view.findViewById<TextView>(R.id.txtDetailCertDetail).text = certificate.description
        return view
    }
}