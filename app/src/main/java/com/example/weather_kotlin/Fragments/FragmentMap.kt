package com.example.weather_kotlin.Fragments

import androidx.fragment.app.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.weather_kotlin.R

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class FragmentMap : Fragment() {

    private val callback = OnMapReadyCallback { googleMap ->

        val minsk = LatLng(53.893009, 27.567444)
        googleMap.addMarker(MarkerOptions().position(minsk).title("Минск - 53.8, 27.5. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(minsk))
        val brest = LatLng(52.097622, 23.734051)
        googleMap.addMarker(MarkerOptions().position(brest).title("Брест - 52.0, 23.7. Темпереатура: +3^С "))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(brest))
        val grodno = LatLng(53.669353, 23.813131)
        googleMap.addMarker(MarkerOptions().position(grodno).title("Гродно 53.6, 23.8. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(grodno))
        val vitebsk = LatLng(55.187222, 30.205116)
        googleMap.addMarker(MarkerOptions().position(vitebsk).title("Витебск 55.1, 30.2. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(vitebsk))
        val polock = LatLng(55.4879 , 28.7856)
        googleMap.addMarker(MarkerOptions().position(polock).title("Полоцк 55.4, 28.7. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(polock))
        val gomel = LatLng(52.435 , 30.975)
        googleMap.addMarker(MarkerOptions().position(gomel).title("Гомель 52.4, 30,9. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(gomel))
        val mogilyov = LatLng(53.917 , 30.345)
        googleMap.addMarker(MarkerOptions().position(mogilyov).title("Могилёв 53,9, 30,3. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(mogilyov))
        val pinsk = LatLng(52.129272, 26.074677)
        googleMap.addMarker(MarkerOptions().position(pinsk).title("Пинск 52,1, 26,0. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pinsk))
        val lepel = LatLng(54.87818, 28.69806)
        googleMap.addMarker(MarkerOptions().position(lepel).title("Лепель 54,8, 28,6. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(lepel))
        val glubokoe = LatLng(55.138, 27.691)
        googleMap.addMarker(MarkerOptions().position(glubokoe).title("Глубокое 53,9, 30,3. Темпереатура: +4^С"))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(glubokoe))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }
}