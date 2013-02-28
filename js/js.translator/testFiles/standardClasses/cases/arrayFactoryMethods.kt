package foo

fun box(): Boolean {
  println("test array")
  val a = array(0, 1, 2, 3, 4)
  if(a[a.size - 1] != 4 || a.size != 5) return false

  println("test doubleArray")
  val da = doubleArray(0.0, 1.1, 2.2, 3.3, 4.4)
  if(da[da.size - 1] != 4.4 || da.size != 5) return false

  println("test floatArray")
  val fa = floatArray(0.0, 1.0, 2.0, 3.0, 4.0)
  if(fa[fa.size - 1] != 4.0 : Float || fa.size != 5) return false

  println("test longArray")
  val la = longArray(0, 1, 2, 3, 4)
  if(la[la.size - 1] != 4 : Long || la.size != 5) return false

  println("test intArray")
  val ia = intArray(0, 1, 2, 3, 4)
  if(ia[ia.size - 1] != 4 || ia.size != 5) return false

  println("test charArray")
  val ca = charArray('0', '1', '2', '3', '4')
  if(ca[ca.size - 1] != '4' || ca.size != 5) return false

  println("test shortArray")
  val sa = shortArray(0, 1, 2, 3, 4)
  if(sa[sa.size - 1] != 4 : Short || sa.size != 5) return false

  println("test byteArray")
  val ba = byteArray(0, 1, 2, 3, 4)
  if(ba[ba.size - 1] != 4 : Byte || ba.size != 5) return false

  println("test booleanArray")
  val boo = booleanArray(true, false, false, true, true)
  if(boo[boo.size - 1] != true || boo.size != 5) return false

  return true
}