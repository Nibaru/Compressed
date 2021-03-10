from PIL import Image

path = "../../src/main/resources/assets/compressed/textures/blocks/"

filename = input("Enter Block Name: ")

compressed_i = Image.open("compressed_i.png")
compressed_ii = Image.open("compressed_ii.png")
compressed_iii = Image.open("compressed_iii.png")
compressed_iv = Image.open("compressed_iv.png")

texture = Image.open("texture.png")

compressed_i = compressed_i.convert("RGBA")
compressed_ii = compressed_ii.convert("RGBA")
compressed_iii = compressed_iii.convert("RGBA")
compressed_iv = compressed_iv.convert("RGBA")
texture = texture.convert("RGBA")


Image.alpha_composite(texture, compressed_i).save(path+""+filename+"_i.png")
Image.alpha_composite(texture, compressed_ii).save(path+""+filename+"_ii.png")
Image.alpha_composite(texture, compressed_iii).save(path+""+filename+"_iii.png")
Image.alpha_composite(texture, compressed_iv).save(path+""+filename+"_iv.png")
