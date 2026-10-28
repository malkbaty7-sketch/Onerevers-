from fastapi import FastAPI, UploadFile, File
from fastapi.responses import JSONResponse

app = FastAPI(title="KaatibDocsPro Tika Service")

@app.get("/health")
def health():
    return {"status": "ok", "service": "tika"}

@app.post("/extract")
async def extract_document(file: UploadFile = File(...)):
    content = await file.read()
    text = (
        f"Extracted text from {file.filename}. "
        f"This is a placeholder response from the Tika integration layer. "
        f"Original file size: {len(content)} bytes."
    )

    return JSONResponse(
        {
            "text": text,
            "metadata": {
                "filename": file.filename,
                "size_bytes": str(len(content)),
                "service": "tika"
            },
        }
    )
