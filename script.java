document.getElementById('applyColor').addEventListener('click', function() {
    const color = document.getElementById('colorPicker').value;
    document.body.style.backgroundColor = color;
    document.getElementById('colorInfo').innerText = getColorDescription(color);
});

function getColorDescription(color) {
    switch (color) {
        case '#ff0000':
            return 'Червоний - колір пристрасті та енергії.';
        case '#00ff00':
            return 'Зелений - символ природи та гармонії.';
        case '#0000ff':
            return 'Синій - колір спокою та стабільності.';
        case '#ffff00':
            return 'Жовтий - колір радості та оптимізму.';
        case '#ff00ff':
            return 'Фіолетовий - колір творчості та уяви.';
        case '#00ffff':
            return 'Блакитний - колір миру та спокою.';
        default:
            return 'Цей колір не має опису, але він унікальний!';
    }
}
