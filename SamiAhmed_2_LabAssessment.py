website = input("Input: ")
split = website.split("/")
file = website.split(".")
protocol = ["http:", "https:", "ftp:"]
extension = ["csv", "docx", "gif", "png", "html", "jpg"]
if split[0] in protocol:
    if file[-1] in extension:
            print("Output: True")
    else:
        print("Output: False (an invalid file extension)")
else:
    print("Output: False (an invalid protocol)")