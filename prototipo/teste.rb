require 'chunky_png'

arquivo = "sampleComper"
#arquivo = "sample.png"

image = ChunkyPNG::Image.from_file(arquivo+".png")
working_image = image.dup

pretoAbsoluto=0
pretoModerado=0
outrasCores=0
totPixel=0

working_image.pixels.map! do |pixel|
  
totPixel+=1

  if ChunkyPNG::Color.r(pixel) == 00 and ChunkyPNG::Color.g(pixel) == 00 and  ChunkyPNG::Color.b(pixel) == 00 
#    puts "Preto Absoluto"
    pretoAbsoluto+=1
  elsif ChunkyPNG::Color.r(pixel) <= 25 and ChunkyPNG::Color.g(pixel) <= 25 and  ChunkyPNG::Color.b(pixel) <= 25
#    puts "Preto Moderado"
    pretoModerado+=1
  else
    outrasCores+=1
  end
  pixel
end

image.save(arquivo+'_color.png')


puts "Valores (Total):"+totPixel.to_s
puts "PretoAbsoluto:"+pretoAbsoluto.to_s + " %:"+ ((pretoAbsoluto*100)/totPixel).to_s
puts "pretoModerado:"+pretoModerado.to_s + " %:"+ ((pretoModerado*100)/totPixel).to_s
puts "outrasCores:"+outrasCores.to_s+ " %:"+ ((outrasCores*100)/totPixel).to_s