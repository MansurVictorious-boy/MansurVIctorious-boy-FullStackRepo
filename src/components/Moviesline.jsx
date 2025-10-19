import React from 'react'

export default function Moviesline() {
  let arr=["Money Hiest","Squied Game","Strager Things"]
    return (
    <div className='Moviesline'>
        {
            arr.map((v)=>(<Movies/>))
        }
    </div>
  )
}
